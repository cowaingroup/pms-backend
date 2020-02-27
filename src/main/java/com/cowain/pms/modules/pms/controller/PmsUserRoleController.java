package com.cowain.pms.modules.pms.controller;

import com.cowain.pms.common.annotation.SysLog;
import com.cowain.pms.common.utils.PageUtils;
import com.cowain.pms.common.utils.R;
import com.cowain.pms.modules.pms.entity.PmsUserRoleEntity;
import com.cowain.pms.modules.pms.service.PmsUserRoleService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 用户与角色对应关系
 *
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2020-01-11 10:41:54
 */
@RestController
@RequestMapping("pms/pmsuserrole")
public class PmsUserRoleController {
    @Autowired
    private PmsUserRoleService pmsUserRoleService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("pms:pmsuserrole:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsUserRoleService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("pms:pmsuserrole:info")
    public R info(@PathVariable("id") Long id){
			PmsUserRoleEntity pmsUserRole = pmsUserRoleService.selectById(id);

        return R.ok().put("pmsUserRole", pmsUserRole);
    }

    /**
     * 保存
     */
    @SysLog("保存用户与角色对应关系")
    @RequestMapping("/save")
    @RequiresPermissions("pms:pmsuserrole:save")
    public R save(@RequestBody PmsUserRoleEntity pmsUserRole){
			pmsUserRoleService.insert(pmsUserRole);

        return R.ok();
    }

    /**
     * 修改
     */
    @SysLog("修改用户与角色对应关系")
    @RequestMapping("/update")
    @RequiresPermissions("pms:pmsuserrole:update")
    public R update(@RequestBody PmsUserRoleEntity pmsUserRole){
			pmsUserRoleService.updateById(pmsUserRole);

        return R.ok();
    }

    /**
     * 删除
     */
    @SysLog("删除用户与角色对应关系")
    @RequestMapping("/delete")
    @RequiresPermissions("pms:pmsuserrole:delete")
    public R delete(@RequestBody Long[] ids){
			pmsUserRoleService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
