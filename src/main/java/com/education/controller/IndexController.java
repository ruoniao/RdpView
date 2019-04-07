package com.education.controller;

import com.education.config.GuacamoleConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;


/**
 * @author: ruoniao@gmail.com
 * @date 2019/3/16 21:49
 * Explain:
 */
@Controller
@Slf4j
public class IndexController {
    @RequestMapping(value = "/connect")
    public String index(@RequestParam(name = "username") String username,
                        @RequestParam(name = "password") String password,
                        @RequestParam(name = "ip") String ip,
                        @RequestParam(name = "port") String port,
                        @RequestParam(name = "width") String width,
                        @RequestParam(name = "heigh") String heigh,
                        Map<String,Object> map) {
        String base_url = String.format("/rdpview/%s&%s&%s&%s&%s&%s",
                ip,port,username,password,width,heigh);
        map.put("base_url",base_url);
        return "guacamole";
    }

}
