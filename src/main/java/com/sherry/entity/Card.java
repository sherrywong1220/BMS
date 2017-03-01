package com.sherry.entity;

/**
 * Created by SherryWong on 2016/12/10.
 */
public class Card {

    private Long id;

    private String cardNum;

    private String cardPwd;

    private String name;

    private Integer maxNum;

    private Integer bookNum;

    //多对一的属性
    private Valid valid;

    //多对一的属性
    private Identity identity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getCardPwd() {
        return cardPwd;
    }

    public void setCardPwd(String cardPwd) {
        this.cardPwd = cardPwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Identity getIdentity() {
        return identity;
    }

    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    public Integer getBookNum() {
        return bookNum;
    }

    public void setBookNum(Integer bookNum) {
        this.bookNum = bookNum;
    }

    public Valid getValid() {
        return valid;
    }

    public void setValid(Valid valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", cardNum='" + cardNum + '\'' +
                ", cardPwd='" + cardPwd + '\'' +
                ", name='" + name + '\'' +
                ", maxNum=" + maxNum +
                ", bookNum=" + bookNum +
                ", valid=" + valid +
                ", identity=" + identity +
                '}';
    }
}
