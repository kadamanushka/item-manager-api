package com.example.itemmanager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.itemmanager.model.Item;

@Service
public class ItemService {

    private List<Item> items = new ArrayList<>();

    // Add item
    public Item addItem(Item item) {
        items.add(item);
        return item;
    }

    // Get by ID
    public Item getItemById(int id) {

        for (Item item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
