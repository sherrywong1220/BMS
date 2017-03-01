package com.sherry.service.impl;

import com.sherry.dao.CardDao;
import com.sherry.entity.Card;
import com.sherry.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by SherryWong on 2016/12/11.
 */

@Repository
public class CardServiceImpl implements CardService{

    @Autowired
    CardDao cardDao;

    public List<Card> queryAll() {
        return cardDao.queryAllCards();
    }

    public int updateCard(Card card) {
        return cardDao.updateCard(card);
    }

    public int deleteCard(Long id) {
        return cardDao.deleteCard(id);
    }

    public Card findOne(String cardNum) {
        return cardDao.queryOneCard(cardNum);
    }

    public int addCard(Card card) {
        return cardDao.insertCard(card);
    }
}
