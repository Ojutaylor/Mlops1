package com.example.backend_rees_pos.rees.items;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "items")
public class Item {

    public String id;
    public String itemCode;
    public String itemName;
    public String itemPrice;
    public String itemCategory;
    public String itemImage;

    public Item() {
    }

    public Item(String id, String itemCode, String itemName, String itemPrice, String itemCategory, String itemImage) {
        this.id = id;
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCategory = itemCategory;
        this.itemImage = itemImage;
    }

    public String getId() {
        return id;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Item [id=" + id + ", itemCode=" + itemCode + ", itemName=" + itemName + ", itemPrice=" + itemPrice
                + ", itemCategory=" + itemCategory + ", itemImage=" + itemImage + "]";
    }
}
