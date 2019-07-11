package com.latiny.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Latiny
 * @version 1.0
 * @description: Demo
 * @date 2019/7/11 20:21
 */
@Controller
@RequestMapping("/security")
public class DemoController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/add")
    public String add() {
        return "demo/add";
    }

    @RequestMapping("/remove")
    public String remove() {
        return "demo/remove";
    }

    @RequestMapping("/nimei")
    public String nimei() {
        return "demo/nimei";
    }


    @RequestMapping("/query")
    public String query() {
        return "demo/query";
    }
}
