package com.cowain.pms.modules.sys.controller;

import com.cowain.pms.common.annotation.SysLog;
import com.cowain.pms.common.utils.Constant;
import com.cowain.pms.common.utils.ExcelUtils;
import com.cowain.pms.common.utils.PageUtils;
import com.cowain.pms.common.utils.R;
import com.cowain.pms.common.validator.Assert;
import com.cowain.pms.modules.sys.entity.SysUserEntity;
import com.cowain.pms.modules.sys.form.PasswordForm;
import com.cowain.pms.modules.sys.service.SysRoleService;
import com.cowain.pms.modules.sys.service.SysUserRoleService;
import com.cowain.pms.modules.sys.service.SysUserService;
import com.cowain.pms.modules.wms.entity.DictEntity;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 系统用户
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年10月31日 上午10:40:10
 */
@RestController
@RequestMapping("/sys/user")
public class SysUserController extends AbstractController {
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysUserRoleService sysUserRoleService;
//    @Autowired
//    private WarehouseUserService warehouseUserService;
//    @Autowired
//    private DictService dictService;
//    @Autowired
//    private DeptService deptService;
//    @Autowired
//    private DepuserService depuserService;
//    @Autowired
//    private WarehouseService warehouseService;
    @Autowired
    private SysRoleService sysRoleService;
    /**
     * 所有用户列表
     */
    @GetMapping("/list")
    @RequiresPermissions("sys:user:list")
    public R list(@RequestParam Map<String, Object> params) {
        //只有超级管理员，才能查看所有管理员列表
        if (getUserId() != Constant.SUPER_ADMIN) {
            params.put("createUserId", getUserId());
        }
        PageUtils page = sysUserService.queryPage(params);

        return R.ok().put("page", page);
    }

    /**
     * 获取登录的用户信息
     */
    @GetMapping("/info")
    public R info() {
        return R.ok().put("user", getUser());
    }

    /**
     * 修改登录用户密码
     */
    @SysLog("修改密码")
    @PostMapping("/password")
    public R password(@RequestBody PasswordForm form) {
        Assert.isBlank(form.getNewPassword(), "新密码不为能空");

        //sha256加密
        String password = new Sha256Hash(form.getPassword(), getUser().getSalt()).toHex();
        //sha256加密
        String newPassword = new Sha256Hash(form.getNewPassword(), getUser().getSalt()).toHex();

        //更新密码
        boolean flag = sysUserService.updatePassword(getUserId(), password, newPassword);
        if (!flag) {
            return R.error("原密码不正确");
        }

        return R.ok();
    }

    /**
     * 用户信息
     */
    @GetMapping("/info/{userId}")
    @RequiresPermissions("sys:user:info")
    public R info(@PathVariable("userId") Long userId) {
        SysUserEntity user = sysUserService.selectById(userId);
        String deptId = "";
        //获取用户所属的角色列表
        List<Long> roleIdList = sysUserRoleService.queryRoleIdList(userId);
        user.setRoleIdList(roleIdList);
        //获取用户对应的部门
//        List<Integer> depuserlist = depuserService.queryByUserId(userId);
//        deptId = Joiner.on(",").skipNulls().join(depuserlist);
//        user.setDeptId(deptId);
        //获取用户工作方式
        DictEntity dict =  null;//dictService.selectByUserId(userId);
        if (dict != null) {
            user.setMgrType(dict.getId());
        }
        return R.ok().put("user", user);
    }

    /**
     * 保存用户
     */
    @SysLog("保存用户")
    @PostMapping("/save")
    @RequiresPermissions("sys:user:save")
    public R save(@RequestBody SysUserEntity user) {
        //ValidatorUtils.validateEntity(user, AddGroup.class);
        user.setCreateUserId(getUserId());
        sysUserService.saveUserInfo(user);
        return R.ok();
    }

    /**
     * 修改用户
     */
    @SysLog("修改用户")
    @PostMapping("/update")
    @RequiresPermissions("sys:user:update")
    public R update(@RequestBody SysUserEntity user) {
        //ValidatorUtils.validateEntity(user, UpdateGroup.class);
        user.setCreateUserId(getUserId());
        sysUserService.updateUserInfo(user);
        return R.ok();
    }

    /**
     * 删除用户
     */
    @SysLog("删除用户")
    @PostMapping("/delete")
    @RequiresPermissions("sys:user:delete")
    public R delete(@RequestBody Long[] userIds) {
        List<Long> idList= Arrays.asList(userIds);
        List<Long> list = new ArrayList<Long>();
        Map<String,Object>map=new HashMap<String, Object>();
        list=idList.stream().filter(e -> !(e.equals(1L)||e.equals(getUserId()))).collect(Collectors.toList());
        if(idList.size()!=list.size()){
            map.put("code",-1);
            map.put("msg","不能删除管理员或当前用户");
        }

        sysUserService.deleteUserInfo(list.toArray(new Long[list.size()]));
        return R.ok(map);
    }

    /**
     * 获取用户所关联的仓库(t_wareHouse_user)
     */
//    @RequestMapping("/option")
//    public R getMangerWare() {
//        List<WarehouseUserDao> mangerWare = warehouseUserService.queryManagerWareList();
//        List<DeptEntity> deptlist = deptService.queryDeptList();
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("status", 1);
//        map.put("type", 5);
//        List<DictEntity> dictlist = dictService.queryDictMap(map);
//        return R.ok().put("MangerWare", mangerWare)
//                .put("deptlist", deptlist)
//                .put("dictlist", dictlist);
//    }

    /**
     * 获取仓库信息
     */
    @RequestMapping("/DictMap")
    public R getDictMap() {
//        List<WarehouseEntity> houseList = warehouseService.queryWareHouseList();
//        return R.ok().put("houseList", houseList);
        return R.ok();
    }

    /**
     * 上传excel
     */
    @SysLog("导入用户")
    @RequestMapping("/uploadExcel")
    public R uploadExcel(MultipartFile excelFile)
    {
        Map<String,Object> map=ExcelUtils.readExcel("", SysUserEntity.class, excelFile);
        if((int)map.get("code")==0){
            List<SysUserEntity> list=(List<SysUserEntity>)map.get("dataList");
            Set<String> userIdSet=new HashSet<String>();
            list.stream().forEach(sysUserEntity -> {
                userIdSet.add(sysUserEntity.getJobNum());
                sysUserEntity.setCreateTime(new Date());
                String salt = RandomStringUtils.randomAlphanumeric(20);
                sysUserEntity.setPassword(new Sha256Hash(sysUserEntity.getJobNum(), salt).toHex());
                sysUserEntity.setSalt(salt);
                sysUserEntity.setCreateUserId(getUserId());
                if(sysUserEntity.getRoleShow()!=null){
                    String[] roleList=sysUserEntity.getRoleShow().split(",");
                    List<Long> roleIdList=sysRoleService.selectRoleIdList(roleList);
                    if(roleList.length!=roleIdList.size()){
                        map.put("code",-1);
                        map.put("msg","用户角色不存在");
                    }else{
                        sysUserEntity.setRoleIdList(roleIdList);
                    }
                }
                if(sysUserEntity.getHouseShow()!=null&&(int)map.get("code")==0){
                    String[] houseList=sysUserEntity.getHouseShow().split(",");
//                    List<Integer> houseIdList=warehouseService.selectHouseIdList(houseList);
//                    if(houseList.length!=houseIdList.size()){
//                        map.put("code",-1);
//                        map.put("msg","仓库信息不存在");
//                    }
//                    else{
//                        sysUserEntity.setHouseIdList(houseIdList);
//                    }
                }
            });
            if((int)map.get("code")==0){
                if(userIdSet.size()==list.size()){
                    sysUserService.insertUserList(list);
                }else{
                    map.put("code",-1);
                    map.put("msg","用户工号重复");
                }

            }
        }

        return R.ok(map);
    }
}
