package com.sherry.service.impl;

import com.sherry.dao.AdminDao;
import com.sherry.entity.Admin;
import com.sherry.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by SherryWong on 2016/11/27.
 */
@Repository
public class AdminServiceImpl implements AdminService{

    //注入Service依赖
    @Autowired
    AdminDao adminDao;

    public int deleteById(long adminId) {
        return adminDao.deleteAdmin(adminId);
    }

    public int insert(Admin admin) {
        return adminDao.insertAdmin(admin);
    }

    public Admin checkLogin(String adminName,String adminPassword) { return adminDao.selectByNameAndPwd(adminName,adminPassword); }

    public List<Admin> queryAll() {
        return adminDao.queryAllAdmin();
    }
}
