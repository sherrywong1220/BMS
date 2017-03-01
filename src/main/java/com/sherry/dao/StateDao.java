package com.sherry.dao;

import com.sherry.entity.State;

import java.util.List;

/**
 * Created by SherryWong on 2016/12/18.
 */
public interface StateDao {

    List<State> queryAllStates();
}
