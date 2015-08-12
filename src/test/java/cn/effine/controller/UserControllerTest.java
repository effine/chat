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

import cn.effine.model.User;
import cn.effine.service.UserService;

@Controller
public class UserControllerTest {

	@Autowired
	private UserService userService;

	@RequestMapping("login")
	public void login() {
		User user = userService.getUser(1);
		System.out.println("name：" + user.getName());
	}

}
