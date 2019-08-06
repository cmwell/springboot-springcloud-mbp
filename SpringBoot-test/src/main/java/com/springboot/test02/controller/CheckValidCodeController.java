package com.springboot.test02.controller;

import cn.hutool.core.util.StrUtil;
import com.springboot.base.BaseController;
import com.springboot.base.ResultEntity;
import com.springboot.gennerator.ValidCodeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 验证码验证类
 *
 * @author zhanghao
 * @date 2019/7/16 17:35
 */
@RestController
@RequestMapping("/account")
public class CheckValidCodeController  extends BaseController{

    @GetMapping("/check")
    public ResultEntity  checkCodeImage(HttpServletRequest request,@RequestParam(value = "valid_image_code") String validImageCode){
        try {
            if (StrUtil.isBlank(validImageCode)){
                return resultInfo(false,"验证码不能为空");
            }
            boolean successCheck = ValidCodeUtil.checkVerifyCode(request, validImageCode);
            if (!successCheck){
                return resultInfo(false,"验证码错误");
            }
            return resultInfo(true,"验证通过",null);
        } catch (Exception e) {
            return resultInfo(false,e.getMessage());
        }
    }
}
