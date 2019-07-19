package com.latiny.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Latiny
 * @version 1.0
 * @description: Login Controller
 * @date 2019/7/19 9:50
 */
@Controller
@RequestMapping("/")
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
