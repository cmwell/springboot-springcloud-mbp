package com.springboot.service;

import com.springboot.base.BaseService;
import com.springboot.entity.User;

import java.util.List;

/**
 * <ul>
 * <li>项目名称：MyTest</li>
 * <li>文件名称：UserService</li>
 * <li>user：张浩</li>
 * <li>日期：2019年05月21日 15时35分</li>
 * <li>Copyright ©2017, 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
public interface UserService extends BaseService<User> {

  void listSomething();
}
