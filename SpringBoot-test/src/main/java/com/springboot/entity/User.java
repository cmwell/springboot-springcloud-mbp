package com.springboot.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.springboot.base.BaseEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * <ul>
 * <li>项目名称：MyTest</li>
 * <li>文件名称：User</li>
 * <li>@author：张浩</li>
 * <li>日期：2019年04月09日 14时15分</li>
 * <li>Copyright ©2017, 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
@Data
@TableName(value = "well_user")
public class User extends BaseEntity<User> {
    private static final long serialVersionUID = 1L;
    @TableId("ID")
    private String id;
    private String userName;
    private Integer sex;
    private String email;
    private String phone;
    private String createTime;
    private String updateTime;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
