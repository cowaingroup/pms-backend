package com.cowain.pms.modules.pms.controller;

import com.cowain.pms.common.annotation.SysLog;
import com.cowain.pms.common.utils.PageUtils;
import com.cowain.pms.common.utils.R;
import com.cowain.pms.modules.pms.entity.PmsDictEntity;
import com.cowain.pms.modules.pms.entity.PmsRoleEntity;
import com.cowain.pms.modules.pms.service.PmsRoleService;
import com.cowain.pms.modules.pms.service.PmsRoleTypeOrOrgService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;



/**
 * 角色
 *
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2020-01-11 10:41:54
 */
@RestController
@RequestMapping("pms/role")
public class PmsRoleController {
    @Autowired
    private PmsRoleService pmsRoleService;

    @Autowired
    private PmsRoleTypeOrOrgService pmsRoleTypeOrOrgService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("pms:pmsrole:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsRoleService.queryList(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{roleId}")
    @RequiresPermissions("pms:pmsrole:info")
    public R info(@PathVariable("roleId") Long roleId){
			PmsRoleEntity pmsRole = pmsRoleService.selectById(roleId);

        return R.ok().put("pmsRole", pmsRole);
    }

    /**
     * 保存
     */
    @SysLog("保存角色")
    @RequestMapping("/save")
    @RequiresPermissions("pms:pmsrole:save")
    public R save(@RequestBody PmsRoleEntity pmsRole){
			pmsRoleService.insert(pmsRole);

        return R.ok();
    }

    /**
     * 修改
     */
    @SysLog("修改角色")
    @RequestMapping("/update")
    @RequiresPermissions("pms:pmsrole:update")
    public R update(@RequestBody PmsRoleEntity pmsRole){
			pmsRoleService.updateById(pmsRole);

        return R.ok();
    }

    /**
     * 删除
     */
    @SysLog("禁用角色")
    @RequestMapping("/delete")
    @RequiresPermissions("pms:pmsrole:delete")
    public R delete(@RequestBody Long[] roleIds){
			pmsRoleService.deleteBatchIds(Arrays.asList(roleIds));

        return R.ok();
    }

    @SysLog("查询角色类型和角色所属")
    @GetMapping("/roleTypeOrSubordinates")
    public R getMangerWare() {
        List<PmsDictEntity> orgs =  pmsRoleTypeOrOrgService.queryOrg();
        List<PmsDictEntity> roleTypes = pmsRoleTypeOrOrgService.queryRoleType();

        return R.ok()
                .put("roleTypes",roleTypes)
                .put("org", orgs );
    }

    @SysLog("批量禁用")
    @PostMapping("/batchDisables")
    public R batchDisables(@RequestBody() List<PmsRoleEntity> roles){
        List<PmsRoleEntity> list = new ArrayList<>();
        for (PmsRoleEntity role : roles) {
            role.setStatus(2);
            list.add(role);
        }
        pmsRoleService.updateBatchById(list);
        return R.ok();
    }

    @SysLog("批量启用")
    @PostMapping("/batchEnabled")
    public R batchEnabled(@RequestBody() List<PmsRoleEntity> roles){
        List<PmsRoleEntity> list = new ArrayList<>();
        for (PmsRoleEntity role : roles) {
            role.setStatus(1);
            list.add(role);
        }
        pmsRoleService.updateBatchById(list);
        return R.ok();
    }

    @SysLog("删除角色")
    @PostMapping("/deleteRole")
    public R deleteRole(@RequestBody() Integer id){

        int count = pmsRoleService.deleteRole(id);
        if (count != 0) {
            return R.error("有用户绑定该角色，无法删除，请取消绑定后再执行删除操作");
        }
            return R.ok();
    }

    @SysLog("批量删除角色")
    @PostMapping("/deleteRoles")
    public R deleteRoles(@RequestBody() Integer[] ids){

        int count = pmsRoleService.deleteRoles(ids);
        if (count != 0) {
            return R.error("有用户绑定该角色，无法删除，请取消绑定后再执行删除操作");
        }
        return R.ok();
    }
}
