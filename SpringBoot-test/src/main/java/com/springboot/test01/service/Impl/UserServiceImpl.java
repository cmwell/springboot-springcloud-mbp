package com.springboot.test01.service.Impl;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.springboot.base.BaseServiceImpl;
import com.springboot.test01.entity.User;
import com.springboot.test01.dao.UserDao;
import com.springboot.test01.service.UserService;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

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
public class UserServiceImpl extends BaseServiceImpl<UserDao,User> implements UserService {


    @Override
    //测试mybatis-plus的iservice
    public void addSomething() {
        User user = new User();
        user.setUserName("zhanghao12");
        user.setSex(2);
        user.setPhone("18801592977");
        user.setEmail("787758657@qq.com");
        user.setBuyType("[10,18,19]");
        if (insert(user)) {
            System.out.println("保存成功");
        }
    }


    @Override
    public void listSomething() {
        //将日期转换为字符串比较 将日期转换为字符串比较是否相等将
        Integer year = 2019;
        Integer month = 6;
        //只可手动写开始月 比如2019/06/01 不可写2019/06/31
        String str = year.toString() + "-" + month.toString() + "-01";
        DateTime parse = DateUtil.parse(str, "yyyy-MM-dd HH-mm:ss");
        String format1 = DateUtil.format(parse, "yyyy-MM-dd HH-mm:ss");
        Date date = new Date();
        String format = DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
        System.out.println(format.equals(format1));
        //开始年
        Integer ayear = 2018;
        String startYear = year+"-"+"01-"+"01"+" 00:"+"00:"+"00";
        Date aparse = DateUtil.parse(startYear, "yyyy-MM-dd HH:mm:ss");
        System.out.println(parse);

    }


    @Override
    public void listById() {
      List<Integer> l = new ArrayList();
      l.add(1);
      l.add(2);
      l.add(3);
      //排序测试
        List<Integer> collect = l.parallelStream().sorted(Comparator.comparing(Integer::longValue).reversed()).collect(Collectors.toList());


    }

    @Override
    public void testDate() {

        int month = 5;
        int year  = 2019;
        //一天的开始
        String startTime = year+"-"+month+"-29"+" 00:00:00";
        //一天的结束
        String endTime = year+"-"+month+"-29"+" 23:59:00";
        EntityWrapper<User> ew = new EntityWrapper<>();
        ew.between("create_time",startTime,endTime);
        List<User> users = selectList(ew);
        System.out.println(users.size());
    }

    @Override
    public void testDelSame() {
        EntityWrapper<User> ew = new EntityWrapper<>();
        ew.eq("user_name","zhanghao22");
        List<User> users = selectList(ew);
        //根据某字段去重复并返回一个list对象
        List<User> collect = users.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(User::getUserName))), ArrayList::new));
        System.out.println(users.size());
        System.out.println(collect.size());
    }

    @Override
    public void dateTest() {
        int month = 2;
        int year  = 2019;
        String aTime = year+"-"+month+"-01";
        Date dateTime = DateUtil.parseDate(aTime);
        System.out.println(DateUtil.endOfMonth(dateTime));

    }
}
