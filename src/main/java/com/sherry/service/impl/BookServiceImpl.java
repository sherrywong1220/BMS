package com.sherry.service.impl;

import com.sherry.dao.BookDao;
import com.sherry.entity.Book;
import com.sherry.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by SherryWong on 2016/11/27.
 */

@Repository
public class BookServiceImpl implements BookService{

    //注入Service依赖
    @Autowired
    BookDao bookDao;

    public int insert(Book book) {
        return bookDao.insertBook(book);
    }

    public int delete(long bookNum) {
        return bookDao.deleteBook(bookNum);
    }

    public List<Book> queryAll(){
        return bookDao.queryAllBook();
    }

    public List<Book> queryByName(String bookName){
        return bookDao.queryByName(bookName);
    }

    public Book findOne(long bookNum){
        return bookDao.queryByNum(bookNum);
    }

    public int updateBook(Book book) {
        return bookDao.updateBook(book);
    }
}
