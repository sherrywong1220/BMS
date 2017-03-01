package com.sherry.web;

import com.sherry.entity.Admin;
import com.sherry.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by SherryWong on 2016/12/10.
 */

@Controller
public class AdminController {

    @Autowired
    AdminService adminService;

    //查询所有管理员
    @RequestMapping(value = "/admin/admins")
    public String showAdmins(ModelMap modelMap){
        List<Admin> adminList=adminService.queryAll();
        modelMap.addAttribute("adminList",adminList);
        return "admin/admins";
    }

    //删除管理员
    @RequestMapping(value="/admin/admins/delete/{adminId}")
    public String deleteAdmin(@PathVariable("adminId") long adminId){
        adminService.deleteById(adminId);
        return "redirect:/admin/admins";
    }

    //添加管理员
    @RequestMapping(value = "/admin/admins/add")
    public String addAdmin(){
        return "admin/addAdmin";
    }

    //添加管理员，POST请求，重定向为查看管理员页面
    @RequestMapping(value = "/admin/admins/addP",method = RequestMethod.POST)
    public String addAdminP(@ModelAttribute("admin") Admin admin){
        adminService.insert(admin);
        return "redirect:/admin/admins";
    }
}
