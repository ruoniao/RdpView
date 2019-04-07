package com.education.bean;

import lombok.Data;

/**
 * @author: ruoniao@gmail.com
 * @date 2019/3/16 22:01
 * Explain:
 */
@Data
public class RdpBean {
    private String user;
    private String ip;
    private Integer port;
    private String password;
    private String width;
    private String height;
}
