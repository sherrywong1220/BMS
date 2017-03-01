package com.sherry.service.impl;

import com.sherry.BaseTest;
import com.sherry.service.AdminService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by SherryWong on 2016/11/27.
 */
public class AdminServiceImplTest extends BaseTest{

    @Autowired
    private AdminService adminService;

    @Test
    public void deleteById() throws Exception {
        int delete=adminService.deleteById(4);
        System.out.println(delete);
    }

    @Test
    public void insert() throws Exception {
//        int insert=adminService.insert("郑爽","12345");
//        System.out.println(insert);
    }

}