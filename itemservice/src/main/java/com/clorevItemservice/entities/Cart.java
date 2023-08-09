package com.clorevItemservice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cart_table")
public class Cart {

    @Id
    @Column(name = "cart_id")
    private int cartId;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_price")
    private double itemPrice;

    @Column(name = "item_mrp")
    private double itemMrp;

    @Column(name = "item_category")
    private String itemCategory;

    @Column(name = "item_maincategory")
    private String itemMainCategory;

    public Cart() {
    }

    public Cart(int cartId, String itemName, double itemPrice, double itemMrp, String itemCategory, String itemMainCategory) {
        this.cartId = cartId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemMrp = itemMrp;
        this.itemCategory = itemCategory;
        this.itemMainCategory = itemMainCategory;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getItemMrp() {
        return itemMrp;
    }

    public void setItemMrp(double itemMrp) {
        this.itemMrp = itemMrp;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getItemMainCategory() {
        return itemMainCategory;
    }

    public void setItemMainCategory(String itemMainCategory) {
        this.itemMainCategory = itemMainCategory;
    }
}
