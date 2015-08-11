package cn.effine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

	/**
	 * 用户注册
	 * 
	 * @param username
	 *            用户名
	 * @param password
	 *            密码
	 * @return
	 */
	@RequestMapping("signup")
	@ResponseBody
	public String signUp(String username, String password) {
		return "login";
	}

	/**
	 * 用户登录
	 * 
	 * @param username
	 *            用户名
	 * @param password
	 *            密码
	 * @return
	 */
	@RequestMapping("signin")
	@ResponseBody
	public String signIn(String username, String password) {
		return "login";
	}

	/**
	 * 用户注销
	 * 
	 * @return
	 */
	@RequestMapping("signout")
	public String signOut() {
		return "login";
	}
}
