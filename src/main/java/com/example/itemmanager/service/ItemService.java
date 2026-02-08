package com.example.itemmanager.service;

import com.example.itemmanager.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    private final List<Item> items = new ArrayList<>();
    private Long idCounter = 1L;

    public ItemService() {
        // sample data
        items.add(new Item(idCounter++, "Pen", "Blue ink pen", 10.0));
        items.add(new Item(idCounter++, "Notebook", "200 pages notebook", 50.0));
    }

    public Item addItem(Item item) {
        item.setId(idCounter++);
        items.add(item);
        return item;
    }

    public Optional<Item> getItemById(Long id) {
        return items.stream()
                .filter(i -> i.getId().equals(id))
                .findFirst();
    }

    public List<Item> getAllItems() {
        return items;
    }
}
