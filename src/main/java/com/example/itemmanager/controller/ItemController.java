package com.example.itemmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.itemmanager.model.Item;
import com.example.itemmanager.service.ItemService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    public ResponseEntity<Item> addItem(@Valid @RequestBody Item item) {
        return ResponseEntity.ok(itemService.addItem(item));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> getItem(@PathVariable int id) {
        Item item = itemService.getItemById(id);
        if (item == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(item);
    }
}
