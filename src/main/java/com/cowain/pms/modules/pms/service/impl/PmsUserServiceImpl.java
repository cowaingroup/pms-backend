package com.cowain.pms.modules.pms.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cowain.pms.common.Constant.ConstantsClass;
import com.cowain.pms.common.utils.PageUtils;
import com.cowain.pms.modules.pms.dao.PmsUserDao;
import com.cowain.pms.modules.pms.dto.PmsUserEntityDto;
import com.cowain.pms.modules.pms.entity.PmsUserEntity;
import com.cowain.pms.modules.pms.service.PmsUserService;
import com.cowain.pms.modules.pms.vo.PmsUserVo;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service("pmsUserService")
public class PmsUserServiceImpl extends ServiceImpl<PmsUserDao, PmsUserEntity> implements PmsUserService {

    @Autowired
    private PmsUserRoleServiceImpl userRoleService;
    @Autowired
    private PmsUserServiceImpl userService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
//        Page<PmsUserEntity> page = this.selectPage(
//                new Query<PmsUserEntity>(params).getPage(),
//                new EntityWrapper<PmsUserEntity>()
//        );

        Page page = new Page(Integer.parseInt(String.valueOf(params.get("page"))),
                Integer.parseInt(String.valueOf(params.get("limit"))));

        page.setRecords(baseMapper.selectRolePageList(page, params));
        List<PmsUserEntityDto> list = new ArrayList<>();
        page.getRecords().forEach(pageDto -> {
            PmsUserVo vo = new PmsUserVo();
                BeanUtils.copyProperties(pageDto, vo);
            list.add(vo);
        });
        return new PageUtils(list, page.getTotal(), page.getCurrent(), page.getSize());

    }

    @Override
    public void deleteUser(Long[] userIds) {
        for (Long userId : userIds) {
            baseMapper.deleteUser(userId);
        }
    }

    @Override
    public void updateUserById(PmsUserEntityDto pmsUser) {

        this.updateById(pmsUser);
    }

    @Override
    public List<Map<String,List>> queryRoleOrg() {

        List<Map<String,List>> list =  baseMapper.queryRoleOrg();
        HashMap<Object, Object> map = new HashMap<>();
        for (Map<String, List> stringListMap : list) {
           map.putAll(stringListMap);
        }
        return list;
    }

    @Override
    public void bindingRoles(Long[] roleIds, Long userId) {

        userRoleService.insertUserRole(roleIds,userId);

    }

    @Override
    public void resetPassword(Long[] ids) {
        //获取初始化密码

        //1.重置密码先获取哪些对象需要重置密码

        for (Long id : ids) {
           String salt =  baseMapper.querySaltById(id);
            //2.获取用户盐，并生成新密码
            String newPass = new Sha256Hash(ConstantsClass.INIT_PASSWORD, salt).toString();
            System.out.println( "长度是："+ newPass.length());
            //3.重置密码
            baseMapper.resetPwd(id,newPass);
        }
    }
}
