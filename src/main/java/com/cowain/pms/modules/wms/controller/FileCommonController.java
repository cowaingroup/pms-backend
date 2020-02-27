package com.cowain.pms.modules.wms.controller;

import com.cowain.commons.file.FileClientUtils;
import com.cowain.commons.file.FileClientUtils;
import com.cowain.pms.common.utils.R;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/app/file")
public class FileCommonController {

    protected org.slf4j.Logger logger = LoggerFactory.getLogger(getClass());

//    FileClientUtils fileClientUtils;

    @PostMapping("/upload")
    public R singleFileUpload(@RequestParam("file") MultipartFile file,
                              RedirectAttributes redirectAttributes) {
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return R.error(1,"文件为空");
        }
        try {
            // groupName = "img"
            String path =  FileClientUtils.saveFile(file,"");
            logger.info("You successfully uploaded '" + file.getOriginalFilename() + "'");
            logger.info("file path url '" + path + "'");
            Map<String,Object> retMap = new HashMap<>();
            retMap.put("filePath",path);
            return R.ok(retMap);
        } catch (Exception e) {
            logger.error("upload file failed",e);
        }
        return R.error("发生异常");
    }

}
