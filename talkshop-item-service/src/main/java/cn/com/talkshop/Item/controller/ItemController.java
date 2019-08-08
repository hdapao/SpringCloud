package cn.com.talkshop.Item.controller;

import cn.com.talkshop.Item.model.Item;
import cn.com.talkshop.Item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: hsh
 * @Date: 2019/8/8 8:14 PM
 * @Description:
 */
@RestController
@RequestMapping("item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<Item> item() {
        return itemService.getItems();
    }
}
