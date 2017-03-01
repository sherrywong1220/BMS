package com.sherry.service.impl;

import com.sherry.dao.TypeDao;
import com.sherry.entity.Type;
import com.sherry.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by SherryWong on 2016/12/6.
 */

@Repository
public class TypeServiceImpl implements TypeService{

    @Autowired
    TypeDao typeDao;

    public List<Type> queryAll() {
        return typeDao.queryAllType();
    }
}
