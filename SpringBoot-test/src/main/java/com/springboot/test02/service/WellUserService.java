package com.springboot.test02.service;

import com.springboot.test02.entity.WellUser;
import com.springboot.base.BaseService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 张浩
 * @since 2019-06-14
 */
public interface WellUserService extends BaseService<WellUser> {


    
    /**
     * 测试数据
     * @return com.springboot.test02.entity.WellUser
     * @author zhanghao
     * @date 2019/6/28 2019/6/28
     */
    void testString();


    WellUser testBoolean(Integer sex);


}
