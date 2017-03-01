package com.sherry.web;

import com.sherry.entity.Card;
import com.sherry.entity.Identity;
import com.sherry.entity.Valid;
import com.sherry.service.CardService;
import com.sherry.service.IdentityService;
import com.sherry.service.ValidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by SherryWong on 2016/12/11.
 */

@Controller
public class CardController {

    @Autowired
    CardService cardService;

    @Autowired
    IdentityService identityService;

    @Autowired
    ValidService validService;

    //添加借阅证
    @RequestMapping(value = "/admin/cards/add")
    public String addCard(ModelMap modelMap){
        List<Identity> identityList=identityService.queryAll();
        List<Valid> validList=validService.queryAll();
        modelMap.addAttribute("identityList",identityList);
        modelMap.addAttribute("validList",validList);
        return "admin/addCard";
    }

    //添加借阅证，POST请求，重定向为查看借阅证页面
    @RequestMapping(value = "/admin/cards/addP",method = RequestMethod.POST)
    public String addCardPost(@ModelAttribute("card") Card card){
        cardService.addCard(card);
        return "redirect:/admin/cards";
    }

    //查看所有借阅证
    @RequestMapping(value = "/admin/cards")
    public String queryAllCards(ModelMap modelMap){
        List<Card> cardList=cardService.queryAll();
        modelMap.addAttribute("cardList",cardList);
        return "admin/cards";
    }

    @RequestMapping(value = "/admin/cards/delete/{id}")
    public String deleteCard(@PathVariable("id") long id){
        cardService.deleteCard(id);
        return "redirect:/admin/cards";
    }
}
