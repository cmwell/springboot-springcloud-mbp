package com.springboot.test02.service.impl;

import com.springboot.test02.entity.WellUser;
import com.springboot.test02.dao.WellUserDao;
import com.springboot.test02.service.WellUserService;
import com.springboot.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 张浩
 * @since 2019-06-14
 */
@Service
public class WellUserServiceImpl extends BaseServiceImpl<WellUserDao, WellUser> implements WellUserService {
	
}
