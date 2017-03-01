package com.sherry.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by SherryWong on 2016/11/27.
 */

@Controller
public class IndexController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
