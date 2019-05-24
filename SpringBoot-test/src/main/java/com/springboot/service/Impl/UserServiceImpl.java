package com.springboot.service.Impl;

import com.springboot.base.BaseServiceImpl;
import com.springboot.entity.User;
import com.springboot.mapper.UserDao;
import com.springboot.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <ul>
 * <li>项目名称：MyTest</li>
 * <li>文件名称：UserServiceImpl</li>
 * <li>user：张浩</li>
 * <li>日期：2019年05月21日 15时37分</li>
 * <li>Copyright ©2017, 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserDao,User> implements UserService{


    @Override
    public void listSomething() {
        User user = new User();
        user.setName("zhangh");
        user.setStatus("2");
        save(user);
    }
}
