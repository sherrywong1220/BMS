package com.sherry.service.impl;

import com.sherry.dao.IdentityDao;
import com.sherry.entity.Identity;
import com.sherry.service.IdentityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by SherryWong on 2016/12/11.
 */

@Repository
public class IdentityServiceImpl implements IdentityService {

    @Autowired
    IdentityDao identityDao;

    public List<Identity> queryAll() {
        return identityDao.queryAllIdentities();
    }
}
