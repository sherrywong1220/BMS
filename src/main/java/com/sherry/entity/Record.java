package com.sherry.entity;

import java.util.Date;

/**
 * Created by SherryWong on 2016/12/18.
 */
public class Record {

    private Long recordId;

    private Long bookNum;

    private Book book;

    private Card card;

    private String name;

    private Date bringDate;

    private Date backDate;

    private State State;

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Long getBookNum() {
        return bookNum;
    }

    public void setBookNum(Long bookNum) {
        this.bookNum = bookNum;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBringDate() {
        return bringDate;
    }

    public void setBringDate(Date bringDate) {
        this.bringDate = bringDate;
    }

    public Date getBackDate() {
        return backDate;
    }

    public void setBackDate(Date backDate) {
        this.backDate = backDate;
    }

    public com.sherry.entity.State getState() {
        return State;
    }

    public void setState(com.sherry.entity.State state) {
        State = state;
    }
}
