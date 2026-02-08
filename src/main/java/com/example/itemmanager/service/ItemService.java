package com.example.itemmanager.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.itemmanager.model.Item;

@Service
public class ItemService {

    private Map<Integer, Item> store = new HashMap<>();
    private int counter = 1;

    public Item addItem(Item item) {
        item.setId(counter++);
        store.put(item.getId(), item);
        return item;
    }

    public Item getItemById(int id) {
        return store.get(id);
    }
}
