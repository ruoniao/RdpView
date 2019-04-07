package com.education.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author: ruoniao@gmail.com
 * @date 2019/3/16 22:15
 * Explain:
 */
@Data
@Component
@ConfigurationProperties(prefix = "guacamole")
public class GuacamoleConfig {
    private Integer port;
    private String ip;

}
