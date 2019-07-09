package com.springboot.test02.entity;

import java.io.Serializable;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.springboot.base.BaseEntity;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 张浩
 * @since 2019-06-14
 */
@Data
@Builder
@Accessors(chain = true)
@TableName("well_user")
@AllArgsConstructor
@NoArgsConstructor
public class WellUser extends BaseEntity<WellUser> {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
	private String id;
	@TableField("USER_NAME")
	private String userName;
	@TableField("PHONE")
	private String phone;
	@TableField("SEX")
	private Integer sex;
	@TableField("EMAIL")
	private String email;
	@TableField("BUY_TYPE")
	private String buyType;
	@TableField("CREATE_TIME")
	private Date createTime;
	@TableField("UPDATE_TIME")
	private Date updateTime;


	public static final String ID = "ID";

	public static final String USER_NAME = "USER_NAME";

	public static final String PHONE = "PHONE";

	public static final String SEX = "SEX";

	public static final String EMAIL = "EMAIL";

	public static final String BUY_TYPE = "BUY_TYPE";

	public static final String CREATE_TIME = "CREATE_TIME";

	public static final String UPDATE_TIME = "UPDATE_TIME";

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
