package com.cowain.pms.modules.sys.controller;

import com.cowain.pms.common.annotation.SysLog;
import com.cowain.pms.common.utils.R;
import com.cowain.pms.modules.sys.entity.SysUserEntity;
import com.cowain.pms.modules.sys.form.SysLoginForm;
import com.cowain.pms.modules.sys.service.SysCaptchaService;
import com.cowain.pms.modules.sys.service.SysUserService;
import com.cowain.pms.modules.sys.service.SysUserTokenService;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
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
public class SysLoginController extends AbstractController {
	@Autowired
	private SysUserService sysUserService;
	@Autowired
	private SysUserTokenService sysUserTokenService;
	@Autowired
	private SysCaptchaService sysCaptchaService;
//	@Autowired
//	private WarehouseService wareHouseService;
//	@Autowired
//	private OwnerInfoService ownerInfoService;

	/**
	 * 验证码
	 */
	@GetMapping("captcha.jpg")
	public void captcha(HttpServletResponse response, String uuid)throws ServletException, IOException {
		/*response.setHeader("Cache-Control", "no-store, no-cache");
		response.setContentType("image/jpeg");

		//获取图片验证码
		BufferedImage image = sysCaptchaService.getCaptcha(uuid);

		ServletOutputStream out = response.getOutputStream();
		ImageIO.write(image, "jpg", out);
		IOUtils.closeQuietly(out);*/
	}

	/**
	 * 登录
	 */
	@PostMapping("/sys/login")
	public Map<String, Object> login(@RequestBody SysLoginForm form)throws IOException {
		boolean captcha = sysCaptchaService.validate(form.getUuid(), form.getCaptcha());
		/*if(!captcha){
			return R.error("验证码不正确");
		}*/

		//用户信息
		SysUserEntity user = sysUserService.queryByUserName(form.getUsername());


		//账号不存在、密码错误
		if(user == null || !user.getPassword().equals(new Sha256Hash(form.getPassword(), user.getSalt()).toHex())) {
			return R.error("账号或密码不正确");
		}

		//账号锁定
		if(user.getStatus() == 0){
			return R.error("账号已被锁定,请联系管理员");
		}

		//生成token，并保存到数据库
		R r = sysUserTokenService.createToken(user.getUserId());
		return r;
	}


	/**
	 * 退出
	 */
	@SysLog("用户退出")
	@PostMapping("/sys/logout")
	public R logout() {
		sysUserTokenService.logout(getUserId());
		return R.ok();
	}

	/**
	 * 获取仓库及货主信息
	 */
	@RequestMapping("/selectNav")
	public R queryWareHouseName() {
//		List<WarehouseEntity> wareHouseList = wareHouseService.queryWareHouseList();
//		List<OwnerInfoEntity> ownerInfoList=ownerInfoService.queryOwnerList();
//		return R.ok().put("wareHouseList", wareHouseList).put("ownerInfoList",ownerInfoList);
		return R.ok();
	}
}
