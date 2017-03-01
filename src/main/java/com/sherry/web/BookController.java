package com.sherry.web;

import com.sherry.entity.Book;
import com.sherry.entity.Type;
import com.sherry.service.BookService;
import com.sherry.service.TypeService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by SherryWong on 2016/12/6.
 */

@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    TypeService typeService;

    //查找所有书籍
    @RequestMapping(value = "/admin/books",method = RequestMethod.GET)
    public String showBooks(ModelMap modelMap){
        List<Book> bookList=bookService.queryAll();
        modelMap.addAttribute("bookList",bookList);
        return "admin/books";
    }

    //添加书籍
    @RequestMapping(value ="/admin/books/add",method = RequestMethod.GET)
    public String addBook(ModelMap modelMap){
        List<Type> typeList=typeService.queryAll();
        modelMap.addAttribute("typeList",typeList);
        return "admin/addBook";
    }

    //添加图书，POST请求，重定向为查看图书页面
    @RequestMapping(value = "/admin/books/addP",method = RequestMethod.POST)
    public String addBookPost(@ModelAttribute("book") Book book){
        //打印图书标题
        System.out.println(book.getBookName());
        //打印图书作者
        System.out.println(book.getWriter());
        int insertNum=bookService.insert(book);
        System.out.println("insertNum="+insertNum);
        return "redirect:/admin/books";
    }

    //查询图书
    @RequestMapping(value = "/admin/books/select",method = RequestMethod.POST)
    public String selectBook(@RequestParam("searchBooksByName") String bookName,ModelMap modelMap){
        List<Book> bookList=bookService.queryByName(bookName);
        modelMap.addAttribute("bookList",bookList);
        return "admin/selectBook";
    }

    //删除图书
    @RequestMapping(value = "/admin/books/delete/{bookNum}")
    public String deleteBook(@PathVariable("bookNum") long bookNum){
        bookService.delete(bookNum);
        return "redirect:/admin/books";
    }

    //查看图书详情
    @RequestMapping(value = "/admin/books/show/{bookNum}")
    public String showBook(@PathVariable("bookNum") long bookNum,ModelMap modelMap){
        Book book=bookService.findOne(bookNum);
        modelMap.addAttribute("book",book);
        return "admin/bookDetail";
    }

    //修改图书
    @RequestMapping(value = "/admin/books/update/{bookNum}")
    public String updateBook(@PathVariable("bookNum") long bookNum,ModelMap modelMap){
        Book book=bookService.findOne(bookNum);
        List<Type> typeList=typeService.queryAll();
        modelMap.addAttribute("book",book);
        modelMap.addAttribute("typeList",typeList);
        return "admin/updateBook";
    }

    //修改图书，POST请求
    @RequestMapping(value = "/admin/books/updateP",method = RequestMethod.POST)
    public String updateBookP(@ModelAttribute("bookP") Book book){
        bookService.updateBook(book);
        return "redirect:/admin/books";
    }
}
