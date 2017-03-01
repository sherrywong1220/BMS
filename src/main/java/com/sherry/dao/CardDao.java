package com.sherry.dao;

import com.sherry.entity.Card;

import java.util.List;

/**
 * Created by SherryWong on 2016/12/10.
 */
public interface CardDao {

    List<Card> queryAllCards();

    int insertCard(Card card);

    int deleteCard(Long id);

    Card queryOneCard(String cardNum);

    int updateCard(Card card);
}
