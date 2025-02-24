package com.example.backend_rees_pos.rees.items;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository <Item, String> {
    
}
