package com.example.backend_rees_pos.rees.items;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/items")
public class ItemController {
    private final ItemService itemService;
    
    @Autowired
    public ItemController( ItemService itemService) {
        this.itemService = itemService;
    }
    @GetMapping
    public List<Item> getAllItems() {
        return null;
    }
    @PostMapping
    public Item addItem(@RequestBody Item item) {
        return itemService.addItem(item);
    }

    @PostMapping("/multiple")
    public List<Item> addMultipleItems(@RequestBody List<Item> items) {
        return itemService.addMultipleItems(items);
    }

}
