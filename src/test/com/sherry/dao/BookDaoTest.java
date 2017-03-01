package com.sherry.dao;

import com.sherry.BaseTest;
import com.sherry.entity.Book;
import com.sherry.entity.Type;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by SherryWong on 2016/11/27.
 */
public class BookDaoTest extends BaseTest{

    @Autowired
    BookDao bookDao;

    @Test
    public void insertBook() throws Exception {
        Type type=new Type();
        type.setSortId(new Long(2));
        type.setSortName("计算机技术");
        Book book=new Book();
        book.setBookName("UML用户指南");
        book.setBrief("本书为UML具体特征的使用提供了指南，描述了使用UML进行开发的过程，旨在让读者掌握UML的术语、规则和惯用法，以及如何有效地使用这种语言，知道如何应用UML去解决一些常见的建模问题。本书由7个部分共33章组成，每章都对一组UML特征及其具体用法进行了详细阐述，其中大部分按入门、术语和概念、常用建模技术、提示和技巧的方式组织。本书还为高级开发人员提供了在高级建模问题中应用UML的一条非常实用的线索。 ");
        book.setCallNumber("TP312UM/91");
        book.setType(type);
        book.setTotalNum(new Long(10));
        book.setCurrentNum(new Long(10));
        book.setWriter("人民邮电出版社");
        book.setPrice(new BigDecimal(59.00));
        book.setPubDate(new Date(2013));
        int insert=bookDao.insertBook(book);
        System.out.println("insert="+insert);
    }

    @Test
    public void deleteBook() throws Exception {
        int delete=bookDao.deleteBook(1);
        System.out.println(delete);
    }

    @Test
    public void queryAllBook() throws Exception {
        List<Book> books=bookDao.queryAllBook();
        for (Book book:books){
            System.out.println(book);
        }
    }

    @Test
    public void queryByName() throws Exception {
        List<Book> books=bookDao.queryByName("java");
        for (Book book:books){
            System.out.println(book);
        }
    }

}