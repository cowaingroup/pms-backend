package com.cowain.pms.modules.pms.controller;

import com.cowain.pms.common.annotation.SysLog;
import com.cowain.pms.common.utils.PageUtils;
import com.cowain.pms.common.utils.R;
import com.cowain.pms.modules.pms.dto.PmsUserEntityDto;
import com.cowain.pms.modules.pms.entity.PmsUserEntity;
import com.cowain.pms.modules.pms.service.PmsUserService;
import com.cowain.pms.modules.sys.service.SysUserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;



/**
 * 系统用户
 *
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2020-01-11 10:41:54
 */
@RestController
@RequestMapping("pms/pmsuser")
public class PmsUserController {
    @Autowired
    private PmsUserService pmsUserService;

    @Autowired
    private SysUserService sysUserService;
    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsUserService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{userId}")
    @RequiresPermissions("pms:pmsuser:info")
    public R info(@PathVariable("userId") Long userId){
			PmsUserEntity pmsUser = pmsUserService.selectById(userId);

        return R.ok().put("pmsUser", pmsUser);
    }

/**
     * 保存
     */

    @SysLog("保存系统用户")
    @RequestMapping("/save")
    @RequiresPermissions("pms:pmsuser:save")
    public R save(@RequestBody PmsUserEntityDto pmsUser){
			pmsUserService.insert(pmsUser);

        return R.ok();
    }

/**
     * 修改
     */

    @SysLog("修改系统用户")
    @RequestMapping("/update")
    @RequiresPermissions("pms:pmsuser:update")
    public R update(@RequestBody PmsUserEntityDto pmsUser){
//			pmsUserService.updateById(pmsUser);
        pmsUserService.updateUserById(pmsUser);
        return R.ok();
    }

/**
     * 删除
     */

    @SysLog("删除系统用户")
    @RequestMapping("/delete")
    @RequiresPermissions("pms:pmsuser:delete")
    public R delete(@RequestBody Long[] userIds){
//			pmsUserService.deleteBatchIds(Arrays.asList(userIds));
        pmsUserService.deleteUser(userIds);
        return R.ok();
    }

    @SysLog("禁用用户")
    @PostMapping("/updateState")
    @RequiresPermissions("pms:pmsuser:updateState")
    public R delete(@RequestBody Long userId){
        sysUserService.updateState(userId);

        return R.ok();
    }

    @SysLog("查询角色所属")
    @GetMapping("/queryRoleOrg")
    public R queryRoleOrg(){

        List<Map<String, List>> list = pmsUserService.queryRoleOrg();
        return R.ok().roleOrg(list);
    }

    @SysLog("绑定角色")
    @PostMapping("/bindingRoles")
    public  R bindingRoles(
            @RequestParam("roleId") Long[] roleId,
            @RequestParam(value = "userId") Long userId){

        pmsUserService.bindingRoles(roleId,userId);

        return R.ok();
    }

    @SysLog("重置密码")
    @PostMapping("/resetPassword")
    public R resetPassword(@RequestParam("ids")Long[] ids){

        if (ids.length != 0) {

            pmsUserService.resetPassword(ids);
            return R.ok();
        }
       return R.error("请选择用户");
    }
}
