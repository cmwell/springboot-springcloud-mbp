package com.springboot.test02.dao;

import com.springboot.test02.entity.WellUser;
import com.springboot.base.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author 张浩
 * @since 2019-06-14
 */
@Mapper
public interface WellUserDao extends BaseDao<WellUser> {

}