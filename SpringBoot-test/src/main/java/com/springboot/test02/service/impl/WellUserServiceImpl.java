package com.springboot.test02.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.springboot.base.BaseServiceImpl;
import com.springboot.test02.dao.WellUserDao;
import com.springboot.test02.entity.WellUser;
import com.springboot.test02.service.WellUserService;
import org.springframework.stereotype.Service;

import java.util.Date;

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

    @Override
    public void testString() {
        Date dateTime = new Date();
        if (dateTime!=null){
            dateTime = null;
        }
        WellUser wellUser = new WellUser();
        wellUser.setId("0264bad482cd4768813cd520a1450d2e");
        wellUser.setUpdateTime(new Date());
        wellUser.setCreateTime(dateTime);
        System.out.println(insertOrUpdate(wellUser));

    }

    @Override
    public WellUser testBoolean(Integer sex) {
       EntityWrapper<WellUser> ew = new EntityWrapper<>();
       ew.eq(WellUser.SEX,sex);
       return  selectOne(ew);

    }

}
