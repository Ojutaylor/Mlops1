package com.example.backend_rees_pos.rees.items;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    private final ItemRepository itemRepository;
   
    @Autowired
    public ItemService( ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
    public Item addItem(Item item) {
        return itemRepository.save(item);
    }
    public List<Item> addMultipleItems(List<Item> items) {
        return itemRepository.saveAll(items);
    }
}
