package com.sherry.service.impl;

import com.sherry.dao.ValidDao;
import com.sherry.entity.Valid;
import com.sherry.service.ValidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by SherryWong on 2016/12/11.
 */

@Repository
public class ValidServiceImpl implements ValidService {

    @Autowired
    ValidDao validDao;

    public List<Valid> queryAll() {
        return validDao.queryAllValids();
    }
}
