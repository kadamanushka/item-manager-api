package com.example.itemmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.itemmanager.model.Item;
import com.example.itemmanager.service.ItemService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    // Add item
    @PostMapping
    public ResponseEntity<?> addItem(@Valid @RequestBody Item item) {

        return ResponseEntity.ok(itemService.addItem(item));
    }

    // Get item
    @GetMapping("/{id}")
    public ResponseEntity<?> getItem(@PathVariable int id) {

        Item item = itemService.getItemById(id);

        if (item == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(item);
    }
}
