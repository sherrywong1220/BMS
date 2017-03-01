package com.sherry.service;

import com.sherry.entity.Card;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by SherryWong on 2016/12/11.
 */

@Repository
public interface CardService {

    List<Card> queryAll();

    int updateCard(Card card);

    int deleteCard(Long id);

    Card findOne(String cardNum);

    int addCard(Card card);
}
