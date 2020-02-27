//package com.cowain.pms.modules.wms.controller;
//
//import com.cowain.pms.common.utils.PageUtils;
//import com.cowain.pms.common.utils.R;
//import com.cowain.pms.modules.wms.entity.DictEntity;
//
//import org.apache.shiro.authz.annotation.RequiresPermissions;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Arrays;
//import java.util.Map;
//
//
//
///**
// *
// *
// * @author tom
// * @email zhaoxinsheng@cowain.com.cn
// * @date 2019-07-16 08:11:28
// */
//@RestController
//@RequestMapping("wms/dict")
//public class DictController {
//    @Autowired
//    private DictService dictService;
//
//    /**
//     * 列表
//     */
//    @RequestMapping("/list")
//    @RequiresPermissions("wms:dict:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = dictService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{id}")
//    @RequiresPermissions("wms:dict:info")
//    public R info(@PathVariable("id") Integer id){
//			DictEntity dict = dictService.selectById(id);
//
//        return R.ok().put("dict", dict);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    @RequiresPermissions("wms:dict:save")
//    public R save(@RequestBody DictEntity dict){
//			dictService.insert(dict);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    @RequiresPermissions("wms:dict:update")
//    public R update(@RequestBody DictEntity dict){
//			dictService.updateById(dict);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    @RequiresPermissions("wms:dict:delete")
//    public R delete(@RequestBody Integer[] ids){
//			dictService.deleteBatchIds(Arrays.asList(ids));
//
//        return R.ok();
//    }
//
//}
