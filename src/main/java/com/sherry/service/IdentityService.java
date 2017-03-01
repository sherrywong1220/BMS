package com.sherry.service;

import com.sherry.entity.Identity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by SherryWong on 2016/12/11.
 */

@Repository
public interface IdentityService {

    List<Identity> queryAll();
}
