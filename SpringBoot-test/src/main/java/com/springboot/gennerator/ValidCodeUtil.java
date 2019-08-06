package com.springboot.gennerator;

import com.google.code.kaptcha.Constants;

import javax.servlet.http.HttpServletRequest;

/**
 * 验证工具类
 *
 * @author zhanghao
 * @date 2019/7/16 17:30
 */
public class ValidCodeUtil {

    public static boolean checkVerifyCode(HttpServletRequest request,String validCode){
        String verifyCodeExpected = (String)request.getSession().getAttribute("yanzhengma");
        if(validCode == null || !validCode.equals(verifyCodeExpected)){
            return false;
        }
        return true;
    }
}
