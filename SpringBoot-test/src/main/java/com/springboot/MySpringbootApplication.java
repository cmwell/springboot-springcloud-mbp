package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * <ul>
 * <li>项目名称：MyTest</li>
 * <li>文件名称：MySpringbootApplication</li>
 * <li>author：张浩</li>
 * <li>日期：2019年04月09日 14时13分</li>
 * <li>Copyright ©2017, 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
@SpringBootApplication
//@ComponentScan(basePackages = {"com.springboot"})
@MapperScan("com.zhiyingwl.**.dao")
public class MySpringbootApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(MySpringbootApplication.class,args);
    }
}
