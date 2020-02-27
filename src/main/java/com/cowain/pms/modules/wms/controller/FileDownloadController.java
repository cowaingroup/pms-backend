//package com.cowain.pms.modules.wms.controller;
//
//import java.util.Arrays;
//import java.util.Map;
//
//import com.cowain.pms.common.annotation.SysLog;
//import org.apache.shiro.authz.annotation.RequiresPermissions;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.cowain.pms.modules.wms.entity.FileDownloadEntity;
//import com.cowain.pms.modules.wms.service.FileDownloadService;
//import com.cowain.pms.common.utils.PageUtils;
//import com.cowain.pms.common.utils.R;
//
//
//
///**
// *
// *
// * @author tom
// * @email zhaoxinsheng@cowain.com.cn
// * @date 2019-09-05 15:58:20
// */
//@RestController
//@RequestMapping("wms/filedownload")
//public class FileDownloadController {
//    @Autowired
//    private FileDownloadService fileDownloadService;
//
//    /**
//     * 列表
//     */
//    @RequestMapping("/list")
//    @RequiresPermissions("wms:filedownload:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = fileDownloadService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{id}")
//    @RequiresPermissions("wms:filedownload:info")
//    public R info(@PathVariable("id") Integer id){
//			FileDownloadEntity fileDownload = fileDownloadService.selectById(id);
//
//        return R.ok().put("fileDownload", fileDownload);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    @RequiresPermissions("wms:filedownload:save")
//    public R save(@RequestBody FileDownloadEntity fileDownload){
//			fileDownloadService.insert(fileDownload);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    @RequiresPermissions("wms:filedownload:update")
//    public R update(@RequestBody FileDownloadEntity fileDownload){
//			fileDownloadService.updateById(fileDownload);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    @RequiresPermissions("wms:filedownload:delete")
//    public R delete(@RequestBody Integer[] ids){
//			fileDownloadService.deleteBatchIds(Arrays.asList(ids));
//
//        return R.ok();
//    }
//
//    /**
//     * 列表
//     */
//    @SysLog("下载模板")
//    @RequestMapping("/queryUrl")
//    public R queryUrl(@RequestParam Map<String, Object> params){
//        String type=(String)params.get("type");
//        String url = fileDownloadService.queryUrl(type);
//
//        return R.ok().put("url", url);
//    }
//}
