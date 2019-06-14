package com.springboot.test01.entity;

import lombok.Data;

import java.util.List;

/**
 * <ul>
 * <li>项目名称：my_test</li>
 * <li>文件名称：UserDto</li>
 * <li>user：张浩</li>
 * <li>日期：2019年05月29日 14时22分</li>
 * <li>Copyright ©2017, 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
@Data
public class UserDto {

    private String id;
    private String userName;
    private Integer sex;
    private String email;
    private String phone;
    private String createTime;
    private String updateTime;
    private List<Integer> buyType;


}
