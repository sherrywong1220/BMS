package com.sherry.service;

import com.sherry.entity.Type;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by SherryWong on 2016/12/6.
 */
@Repository
public interface TypeService {

    List<Type> queryAll();

}
