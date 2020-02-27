package com.cowain.pms.modules.sys.controller;

import com.cowain.pms.common.utils.R;
import com.cowain.pms.modules.sys.entity.SysUserEntity;
import com.cowain.pms.modules.sys.form.SysLoginForm;
import com.cowain.pms.modules.sys.service.SysCaptchaService;
import com.cowain.pms.modules.sys.service.SysUserService;
import com.cowain.pms.modules.sys.service.SysUserTokenService;
import org.apache.commons.io.IOUtils;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Map;

/**
 * 登录相关
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年11月10日 下午1:15:31
 */
@RestController
public class TestController extends AbstractController {
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysUserTokenService sysUserTokenService;
    @Autowired
    private SysCaptchaService sysCaptchaService;

    /**
     @RequestMapping("/update")
     @RequiresPermissions("wms:dept:update")
     public R update(@RequestBody DeptEntity dept) {
     dept.setUpdateTime(new Date());
     dept.setUpdateUserId(getUserId().intValue());
     deptService.updateById(dept);

     return R.ok();
     }
     */
    @RequestMapping("/test")
    public R handlerRFID(@RequestBody String lotId)  {

        System.out.println("lot_id :" + lotId);
        return R.ok();
    }


}
