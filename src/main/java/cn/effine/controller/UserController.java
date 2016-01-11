/**
 * @author effine
 * @Date 2015年8月12日  下午11:45:51
 * @email verphen#gmail.com
 * @site http://www.effine.cn
 */

package cn.effine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.effine.model.User;
import cn.effine.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;

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
		User user = userService.getUser(1);
		System.out.println("name：" + user.getName());
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
