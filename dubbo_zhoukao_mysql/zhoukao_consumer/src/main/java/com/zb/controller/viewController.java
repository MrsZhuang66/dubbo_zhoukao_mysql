package com.zb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class viewController {

    @RequestMapping(value = "/index")

    public String index(){
        return "/index";
    }
}
