package com.springboot.gennerator;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * 生成验证码
 *
 * @author zhanghao
 * @date 2019/7/16 14:40
 */
@Configuration
public class KaptchaController {
    @Bean(name="captchaProducer")
    public DefaultKaptcha getKaptchaBean(){
        DefaultKaptcha defaultKaptcha=new DefaultKaptcha();
        Properties properties=new Properties();
        properties.setProperty("kaptcha.border", "no");
        properties.setProperty("kaptcha.textproducer.font.color", "blue");
        properties.setProperty("kaptcha.image.width", "400");
        properties.setProperty("kaptcha.image.height", "125");
        properties.setProperty("kaptcha.session.key", "code");
        properties.setProperty("kaptcha.textproducer.char.length", "4");
        properties.setProperty("kaptcha.textproducer.font.size","120");
        properties.setProperty("kaptcha.textproducer.font.names", "宋体,楷体,微软雅黑");
        properties.setProperty("kaptcha.textproducer.char.space","16");
        properties.setProperty("kaptcha.noise.color","blue");
        properties.setProperty("kaptcha.obscurificator.impl","com.springboot.gennerator.DisKaptchaCss");
        properties.setProperty("kaptcha.background.impl","com.springboot.gennerator.NoKaptchaBackhround");
        Config config=new Config(properties);
        defaultKaptcha.setConfig(config);
        return defaultKaptcha;
    }
}
