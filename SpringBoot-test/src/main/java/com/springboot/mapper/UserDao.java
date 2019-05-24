package com.springboot.mapper;

import com.springboot.base.BaseDao;
import com.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <ul>
 * <li>项目名称：MyTest</li>
 * <li>文件名称：UserMapper</li>
 * <li>user：张浩</li>
 * <li>日期：2019年05月21日 14时43分</li>
 * <li>Copyright ©2017, 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
@Mapper
public interface UserDao extends BaseDao<User>{
}
