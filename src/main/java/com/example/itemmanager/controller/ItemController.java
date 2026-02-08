package com.example.itemmanager.controller;

import com.example.itemmanager.model.Item;
import com.example.itemmanager.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    // 1️⃣ Add new item
    @PostMapping
    public ResponseEntity<Item> addItem(@Valid @RequestBody Item item) {
        return new ResponseEntity<>(itemService.addItem(item), HttpStatus.CREATED);
    }

    // 2️⃣ Get item by ID
    @GetMapping("/{id}")
    public ResponseEntity<Item> getItem(@PathVariable Long id) {
        Item item = itemService.getItemById(id);
        if (item == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(item);
    }

    // (Extra helper) Get all items
    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }
}
