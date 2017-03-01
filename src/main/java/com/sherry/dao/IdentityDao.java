package com.sherry.dao;

import com.sherry.entity.Identity;

import java.util.List;

/**
 * Created by SherryWong on 2016/12/11.
 */
public interface IdentityDao {

    List<Identity> queryAllIdentities();

}
