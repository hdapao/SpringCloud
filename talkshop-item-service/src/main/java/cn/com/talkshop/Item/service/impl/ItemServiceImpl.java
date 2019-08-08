package cn.com.talkshop.Item.service.impl;

import cn.com.talkshop.Item.model.Item;
import cn.com.talkshop.Item.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hsh
 * @Date: 2019/8/8 8:18 PM
 * @Description:
 */
@Service("ItemService")
public class ItemServiceImpl implements ItemService{

    @Override
    public List<Item> getItems() {
        List<Item> list = new ArrayList();
        list.add(new Item(1L,"笔记本1","12"));
        list.add(new Item(2L,"笔记本2","13"));
        list.add(new Item(3L,"笔记本3","14"));
        return list;
    }
}
