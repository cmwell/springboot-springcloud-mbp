package com.springboot.test01.service;

import com.springboot.base.BaseService;
import com.springboot.test01.entity.User;


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

  void addSomething();

  /** 测试mp
   * @param
   * @return void
   * @author 张浩
   * @date 2019/5/28 9:52
   */
  void listSomething();

  /** 获取所有的数据
   * @param
   * @return void
   * @author 张浩
   * @date 2019/5/29 14:19
   */
  void listById();

  /**测试日期
   * @param
   * @return void
   * @author 张浩
   * @date 2019/6/4 15:03
   */
  void testDate();

  /**java8 去重某字段
   * @param
   * @return void
   * @author 张浩
   * @date 2019/6/5 16:46
   */
  void testDelSame();

  /**日期测试
   * @param
   * @return void
   * @author 张浩
   * @date 2019/6/11 11:28
   */
  void dateTest();


  void listS();
}
