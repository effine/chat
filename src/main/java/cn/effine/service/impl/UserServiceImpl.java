/**
 * @author effine
 * @Date 2015年8月12日  下午11:45:51
 * @email verphen#gmail.com
 * @site http://www.effine.cn
 */

package cn.effine.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.effine.dao.UserDao;
import cn.effine.model.User;
import cn.effine.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public User getUser(int uid) {
		return userDao.getUser(uid);
	}

}
