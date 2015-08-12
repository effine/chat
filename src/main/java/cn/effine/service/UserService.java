/**
 * @author effine
 * @Date 2015年8月12日  下午11:45:51
 * @email verphen#gmail.com
 * @site http://www.effine.cn
 */

package cn.effine.service;

import cn.effine.model.User;

public interface UserService {
	/**
	 * @param uid
	 *            用户ID
	 * @return 用户Mode
	 */
	User getUser(int uid);
}
