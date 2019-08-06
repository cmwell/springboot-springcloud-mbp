package com.springboot.test01.entity;

import lombok.Data;

/**
 * <ul> php序列化文件
 * <li>项目名称：MyTest</li>
 * <li>文件名称：Test</li>
 * <li>user：张浩</li>
 * <li>日期：2019年04月16日 15时58分</li>
 * <li>Copyright ©2017, 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
@Data
public class TestC {
    private String mobile;
    private String password;
    private String  real_name;
    private Integer teacher_type;
    private String  teacher_other_name;
    private String  company_name;
    private String  job_name;
    private String  job;
    private String  sex;
    private String contact_email;
    private String birthday;
    /**
     * 专业负责人
     * */
    private String person_in_Charge;
    /**
     * 专业负责人联系方式
     * */
    private String person_in_charge_contact;




}
