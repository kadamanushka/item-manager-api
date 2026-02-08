package com.example.itemmanager.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.itemmanager.model.Item;

@Service
public class ItemService {

    private final Map<Integer, Item> items = new HashMap<>();
    private int currentId = 1;

    public Item addItem(Item item) {
        item.setId(currentId++);
        items.put(item.getId(), item);
        return item;
    }

    public Item getItemById(int id) {
        return items.get(id);
    }
}
