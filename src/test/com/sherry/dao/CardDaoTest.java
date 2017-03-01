package com.sherry.dao;

import com.sherry.BaseTest;
import com.sherry.entity.Card;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by SherryWong on 2016/12/12.
 */
public class CardDaoTest extends BaseTest {

    @Autowired
    CardDao cardDao;

    @Test
    public void queryAllCards() throws Exception {
        List<Card> cardList=cardDao.queryAllCards();
        for (Card card:cardList){
            System.out.println(card);

        }
    }

}