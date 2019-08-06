package com.springboot.test02.controller;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;

/**
 * 生成验证码
 *
 * @author zhanghao
 * @date 2019/7/16 14:42
 */
@Controller
public class ChaController {
    @Autowired
    private Producer captchaProducer;
    @GetMapping("/getvalidCodeImage")
    public void getKaptchaImage(HttpServletResponse response, HttpSession session) throws Exception {

        //禁止缓存
        response.setDateHeader("Expires", 0);
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        response.setHeader("Pragma", "no-cache");
        //设置响应格式为图片
        response.setContentType("image/png");
        //为验证码创建一个文本
        String capText = captchaProducer.createText();
        //将验证码存到session
        session.setAttribute("yanzhengma", capText);
        // 用创建的验证码文本生成图片
        BufferedImage bi = captchaProducer.createImage(capText);
        ServletOutputStream out = response.getOutputStream();
        //写出图片
        ImageIO.write(bi, "png", out);
        try {
            out.flush();
        } finally {
            out.close();
        }
    }

}
