package com.springboot.test02.service.impl;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONStrFormater;
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
        boolean wangba = insert(WellUser.builder()
                .userName("wangba")
                .phone("110")
                .email("787758657@qq.com")
                .buyType(JSONStrFormater.format("[7,6,5]")).build());
        if (wangba){
            System.out.println("保存成功");
        }

    }

    @Override
    public WellUser testBoolean(Integer sex) {
       EntityWrapper<WellUser> ew = new EntityWrapper<>();
       ew.eq(WellUser.SEX,sex);
       return  selectOne(ew);

    }

}
