package com.sherry.dao;

import com.sherry.entity.Type;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by SherryWong on 2016/11/26.
 */
public interface TypeDao {

    /**
     * 查询所有分类
     * @return
     */
    List<Type> queryAllType();

    /**
     * 更新分类名字
     * @param sortId
     * @param sortName
     * @return 如果影响行数=>1，表示更新的记录行数
     */
    int updateById(@Param("sortId") long sortId,@Param("sortName") String sortName);

    /**
     * 增加分类
     * @param sortName
     * @return 如果影响行数=>1，表示插入的记录行数
     */
    int insertType(@Param("sortName") String sortName);
}
