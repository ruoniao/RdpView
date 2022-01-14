package com.education.config;

import com.education.servlet.RdpServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: ruoniao@gmail.com
 * @date 2019/3/16 21:46
 * Explain:
 */
@Configuration
public class MyServletConfig {
    @Bean
    //注册servlet组件
    public ServletRegistrationBean myServlet(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new RdpServlet(),
                "/rdpview/*");
        return servletRegistrationBean;
    }
}
