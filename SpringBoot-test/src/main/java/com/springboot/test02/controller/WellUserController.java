package com.springboot.test02.controller;


import com.springboot.base.ResultEntity;
import com.springboot.test02.service.WellUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.springboot.base.BaseController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 张浩
 * @since 2019-06-14
 */
@RestController
@RequestMapping("/well-user")
public class WellUserController extends BaseController {
    @Autowired
    private WellUserService wellUserService;

    @GetMapping("/test/{sex}")
    public ResultEntity  testWeb(@PathVariable(value = "sex")Integer sex, HttpServletRequest request){
        try {
            String requestURI = request.getRequestURI();
            String remoteHost = request.getRemoteHost();
            System.out.println(remoteHost);
            System.out.println(requestURI);
            System.out.println(request.getHeader("Origin"));
            return resultInfo(true,"查询成功",wellUserService.testBoolean(sex));
        } catch (Exception e) {
            return resultInfo(false,e.getMessage());
        }

    }
}
