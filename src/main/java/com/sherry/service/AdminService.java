package com.sherry.service;

import com.sherry.entity.Admin;
import com.sherry.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by SherryWong on 2016/11/27.
 */
@Repository
public interface AdminService {

    /**
     * 删除管理员
     * @param adminId
     * @return
     */
    int deleteById(long adminId);

    /**
     * 添加管理员
     * @param admin
     * @return
     */
    int insert(Admin admin);

    /**
     * 登录验证
     * @param adminName
     * @param adminPassword
     * @return
     */
    Admin checkLogin(String adminName,String adminPassword);

    /**
     * 查询全部管理员
     * @return
     */
    List<Admin> queryAll();
}
