package com.education.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;


@Controller
@Slf4j
public class IndexController {
    @RequestMapping(value = "/rdp")
    public String index(@RequestParam(name = "username") String username,
                        @RequestParam(name = "password") String password,
                        @RequestParam(name = "ip") String ip,
                        @RequestParam(name = "port") String port,
                        @RequestParam(name = "width") String width,
                        @RequestParam(name = "height") String height,
                        Map<String, Object> map) {
        String base_url = String.format("/rdpview/%s&%s&%s&%s&%s&%s",
                ip, port, username, password, width, height);
        map.put("base_url", base_url);
        return "guacamole";
    }

}
