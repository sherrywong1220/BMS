package com.sherry.dao;

import com.sherry.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by SherryWong on 2016/11/26.
 */
public interface BookDao {

    /**
     * 添加图书
     * @param book
     * @return 如果影响行数=>1，表示更新的记录行数
     */
    //int insertBook(@Param("book") Book book);
    int insertBook(Book book);  //去掉@Param("book")insert中parameter设置为Book居然就正确了

    /**
     * 删除图书
     * @param bookNum
     * @return 如果影响行数=>1，表示更新的记录行数
     */
    int deleteBook(@Param("bookNum") long bookNum);

    /**
     * 查询所有图书
     * @return
     */
    List<Book> queryAllBook();

    /**
     * 通过名字查询图书
     * @param bookName
     * @return
     */
    List<Book> queryByName(@Param("bookName") String bookName);

    /**
     * 通过id查询图书
     * @param bookNum
     * @return
     */
    Book queryByNum(@Param("bookNum") long bookNum);

    int updateBook(Book book);

}
