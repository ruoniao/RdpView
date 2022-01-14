package com.education.config;

import com.education.servlet.RdpServlet;
import org.springframework.beans.factory.annotation.Value;
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
    public ServletRegistrationBean<RdpServlet> rdpServlet(
            @Value("${guacd.host}") String host,
            @Value("${guacd.port}") Integer port
    ) {
        return new ServletRegistrationBean<>(new RdpServlet(host, port), "/rdpview/*");
    }
}
