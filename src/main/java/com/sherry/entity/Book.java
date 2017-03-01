package com.sherry.entity;

import java.math.BigDecimal;

import java.util.Date;

/**
 * Created by SherryWong on 2016/11/26.
 */
public class Book {

    private Long bookNum;

    private String bookName;

    private String writer;

    private String callNumber;

    private BigDecimal price;

    private String pubCompany;

    private Date pubDate;

    private Long totalNum;

    private Long currentNum;

    private String brief;

    // 多对一的复合属性
    private Type type;

    public Long getBookNum() {
        return bookNum;
    }

    public void setBookNum(Long bookNum) {
        this.bookNum = bookNum;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPubCompany() {
        return pubCompany;
    }

    public void setPubCompany(String pubCompany) {
        this.pubCompany = pubCompany;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public Long getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
    }

    public Long getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(Long currentNum) {
        this.currentNum = currentNum;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookNum=" + bookNum +
                ", bookName='" + bookName + '\'' +
                ", writer='" + writer + '\'' +
                ", callNumber='" + callNumber + '\'' +
                ", price=" + price +
                ", pubCompany='" + pubCompany + '\'' +
                ", pubDate=" + pubDate +
                ", totalNum=" + totalNum +
                ", currentNum=" + currentNum +
                ", brief='" + brief + '\'' +
                ", type=" + type +
                '}';
    }
}
