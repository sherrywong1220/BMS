package com.sherry.web;

import com.fasterxml.jackson.annotation.JsonView;
import com.sherry.dto.Result;
import com.sherry.dto.Views;
import com.sherry.entity.Admin;
import com.sherry.entity.User;
import com.sherry.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


/**
 * Created by SherryWong on 2016/11/28.
 */

@Controller
public class LoginController {

    private Logger logger= LoggerFactory.getLogger(LoginController.class);

    @Autowired
    AdminService adminService;
/*
    @RequestMapping(value ="/login/checkLogin",method = RequestMethod.POST)
    public String checkLogin(@ModelAttribute("user")User user){

        if (user.getUserType().equals("admin")){    //验证管理员登录
            Admin admin=adminService.checkLogin(user.getUserName(),user.getPassword());
            if (admin!=null) {
                return "admin";
            }else {
                return "error";
            }
        }else if(user.getUserType().equals("student")){ //验证学生登录

        }else { //验证教师登录

        }
        return null;
    }
    */

    @JsonView(Views.Public.class)
    @RequestMapping(value = "/login/checkUser/admin")
    @ResponseBody
    public  Result checkAdmin(@RequestBody User user){

        Result result=new Result();
        logger.info("start check");
        Admin admin=adminService.checkLogin(user.getUserName(),user.getPassword());
        if (admin!=null) {
            result.setCode("200");
            result.setMsg("成功");
        }else {
            result.setCode("204");
            result.setMsg("用户名或密码错误");
        }
        return result;
    }

    @RequestMapping(value = "/admin")
    public String admin(){
        return "redirect:/admin/books";
    }

}
