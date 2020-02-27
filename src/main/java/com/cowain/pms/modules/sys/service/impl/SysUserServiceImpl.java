package com.cowain.pms.modules.sys.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cowain.pms.common.exception.RRException;
import com.cowain.pms.common.utils.Constant;
import com.cowain.pms.common.utils.PageUtils;
import com.cowain.pms.common.utils.R;
import com.cowain.pms.modules.sys.dao.SysUserDao;
import com.cowain.pms.modules.sys.entity.SysUserEntity;
import com.cowain.pms.modules.sys.service.SysRoleService;
import com.cowain.pms.modules.sys.service.SysUserRoleService;
import com.cowain.pms.modules.sys.service.SysUserService;
import com.cowain.pms.modules.sys.service.SysUserTokenService;
import com.cowain.pms.modules.wms.entity.WarehouseUserEntity;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * 系统用户
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年9月18日 上午9:46:09
 */
@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUserEntity> implements SysUserService {
    @Autowired
    private SysUserRoleService sysUserRoleService;
    @Autowired
    private SysRoleService sysRoleService;
//    @Autowired
//    private WarehouseService warehouseService;
//    @Autowired
//    private  WarehouseUserService warehouseUserService;
//    @Autowired
//    private DepuserService depuserService;
//    @Autowired
//    private OwnerInfoService ownerInfoService;
    @Autowired
    private SysUserTokenService sysUserTokenService;


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
//        String username = (String) params.get("key");
//        Long createUserId = (Long) params.get("createUserId");
//        Page<SysUserEntity> page = this.selectPage(
//                new Query<SysUserEntity>(params).getPage(),
//                new EntityWrapper<SysUserEntity>()
//                        .like(StringUtils.isNotBlank(username), "job_num", username)
//                        .eq(createUserId != null, "create_user_id", createUserId)
//        );

        Page page = new Page(Integer.parseInt(String.valueOf(params.get("page"))),
                Integer.parseInt(String.valueOf(params.get("limit"))));
        page.setRecords(baseMapper.selectUserPageList(page,params));

        return new PageUtils(page);
    }

    @Override
    public List<String> queryAllPerms(Long userId) {
        return baseMapper.queryAllPerms(userId);
    }

    @Override
    public List<Long> queryAllMenuId(Long userId) {
        return baseMapper.queryAllMenuId(userId);
    }

    @Override
    public SysUserEntity queryByUserName(String username) {
        return baseMapper.queryByUserName(username);
    }

    @Override
    public void save(SysUserEntity user) {
        user.setCreateTime(new Date());
        //sha256加密
        String salt = RandomStringUtils.randomAlphanumeric(20);
        user.setPassword(new Sha256Hash(user.getPassword(), salt).toHex());
        user.setSalt(salt);
        this.insert(user);

        //检查角色是否越权
        checkRole(user);

        //保存用户与角色关系
        sysUserRoleService.saveOrUpdate(user.getUserId(), user.getRoleIdList());
    }

    @Override
    public void update(SysUserEntity user) {
        if (StringUtils.isBlank(user.getPassword())) {
            user.setPassword(null);
        } else {
            user.setPassword(new Sha256Hash(user.getPassword(), user.getSalt()).toHex());
        }
        this.updateById(user);

        //检查角色是否越权
        checkRole(user);

        //保存用户与角色关系
        sysUserRoleService.saveOrUpdate(user.getUserId(), user.getRoleIdList());
    }

    @Override
    public void deleteBatch(Long[] userId) {
        this.deleteBatchIds(Arrays.asList(userId));
    }

    @Override
    public boolean updatePassword(Long userId, String password, String newPassword) {
        SysUserEntity userEntity = new SysUserEntity();
        userEntity.setPassword(newPassword);
        return this.update(userEntity,
                new EntityWrapper<SysUserEntity>().eq("user_id", userId).eq("password", password));
    }

    /**
     * 检查角色是否越权
     */
    private void checkRole(SysUserEntity user) {
        if (user.getRoleIdList() == null || user.getRoleIdList().size() == 0) {
            return;
        }
        //如果不是超级管理员，则需要判断用户的角色是否自己创建
        if (user.getCreateUserId() == Constant.SUPER_ADMIN) {
            return;
        }

        //查询用户创建的角色列表
        List<Long> roleIdList = sysRoleService.queryRoleIdList(user.getCreateUserId());

        //判断是否越权
        if (!roleIdList.containsAll(user.getRoleIdList())) {
            throw new RRException("新增用户所选角色，不是本人创建");
        }
    }


    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void saveUserInfo(SysUserEntity user) {
        //保存用户
        save(user);
        String housCode = user.getHouseCode();
        WarehouseUserEntity warehouseUserEntity = new WarehouseUserEntity();
        warehouseUserEntity.setStatus(1);
        warehouseUserEntity.setUserId(user.getUserId().intValue());
        String[] codeArray = housCode.split(",");
        //将状态 用户id 和 仓库的id 插到 t_warehouse_user

    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void updateUserInfo(SysUserEntity user) {
        update(user);
      /*  // 删除原来的用户部门信息t_dept_user
        int delres = depuserService.deleteByUserId(user.getUserId());
        // 插入新的用户部门信息t_dept_user
        String[] deptArray = user.getDeptId().split(",");
        List<DepuserEntity> depuserList = new ArrayList<DepuserEntity>();
        for (String t : deptArray) {
            if(t != null && t != "")
            {
                DepuserEntity depuser = new DepuserEntity();
                depuser.setUserId(user.getUserId().intValue());
                depuser.setStatus(user.getStatus());
                depuser.setDeptId(Integer.parseInt(t));
                depuser.setMgrType(user.getMgrType());
                depuserList.add(depuser);
            }
        }
        if (depuserList.size()!= 0) {
            int intres = depuserService.insertDepuser(depuserList);
        }*/
        // 删除原来的管理员id 所对应的仓库号映射
//        warehouseUserService.deleteManagerWare(user.getUserId().intValue());
        // 获取管理员管理仓库号
        //删除原来的管理员id 所对应的仓库号映射
//        warehouseUserService.deleteManagerWare(user.getUserId().intValue());
        //获取管理员管理仓库号
        String code_List = user.getHouseCode();
        // WarehouseUserEntity
        WarehouseUserEntity whue = new WarehouseUserEntity();
        whue.setStatus(1);
        whue.setUserId(user.getUserId().intValue());
        String[] codeArray = code_List.split(",");
        // 将状态 用户id 和 仓库的id 插到 t_warehouse_user
        for (int i = 0; i < codeArray.length; i++) {
            whue.setWarehouseId(Integer.parseInt(codeArray[i]));
//            warehouseUserService.insert(whue);
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void deleteUserInfo(Long[] userIds) {
        deleteBatch(userIds);
        //删除部门用户信息
//        int delres = depuserService.deleteByUserIds(userIds);
//        warehouseUserService.deleteManagerWareList(userIds);
    }

    @Override
    public List<String> selUserRole(int userId) {
        return baseMapper.selUserRole(userId);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insertUserList(List<SysUserEntity> list) {
        list.forEach(sysUserEntity -> {
            this.insert(sysUserEntity);
            //检查角色是否越权
            checkRole(sysUserEntity);
            //保存用户与角色关系
            sysUserRoleService.saveOrUpdate(sysUserEntity.getUserId(), sysUserEntity.getRoleIdList());
            if (sysUserEntity.getHouseIdList() != null) {
                //保存用户与仓库关系
                sysUserEntity.getHouseIdList().forEach(houseId -> {
                    WarehouseUserEntity warehouseUserEntity = new WarehouseUserEntity();
                    warehouseUserEntity.setStatus(1);
                    warehouseUserEntity.setUserId(sysUserEntity.getUserId().intValue());
                    warehouseUserEntity.setWarehouseId(houseId);
//                    warehouseUserService.insert(warehouseUserEntity);
                });
            }

        });

    }

    @Override
    public R queryPdaUserInfo(SysUserEntity SysUserEntity) {

        return R.ok();
    }

    @Override
    public void updateState(Long userId) {

        //2.拿到每个角色id，并查询出每个角色状态
        int statusCode = baseMapper.queryUser(userId);
        int status = statusCode == 1 ? 2 : 1;
        baseMapper.updateState(status, userId);
    }
}
