package com.education.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author: ruoniao@gmail.com
 * @date 2019/3/19 12:00
 * Explain:
 */
@Component
public class RdpViewConfig {

    @Autowired
    private GuacamoleConfig guacamoleConfig;

    @Bean
    public GuacamoleConfig getGuacamole(){
        return new GuacamoleConfig();
    }

}
