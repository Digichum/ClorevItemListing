package com.clorevItemservice.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "kids")
public class Kid {

    @Id
    @Column(name = "K_Id")
    private int kidItemId;

    @Column(name = "K_Item")
    private String kidItemName;

    @Column(name = "K_Item_types")
    private String kidItemType;

    @Column(name = "K_MRP")
    private double kidItemMrp;

    @Column(name = "K_Price")
    private double kidItemPrice;

    @ManyToOne
    @JoinColumn(name = "kid_category")
    @JsonBackReference(value = "kidList-mainCategory")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "main_ctg_fkey")
    @JsonBackReference(value = "kidItemList-mainCategory")
    private MainCategory mainCategory;

    public Kid() {
    }

    public Kid(int kidItemId, String kidItemName, String kidItemType, double kidItemMrp, double kidItemPrice, Category category, MainCategory mainCategory) {
        this.kidItemId = kidItemId;
        this.kidItemName = kidItemName;
        this.kidItemType = kidItemType;
        this.kidItemMrp = kidItemMrp;
        this.kidItemPrice = kidItemPrice;
        this.category = category;
        this.mainCategory = mainCategory;
    }

    public int getKidItemId() {
        return kidItemId;
    }

    public void setKidItemId(int kidItemId) {
        this.kidItemId = kidItemId;
    }

    public String getKidItemName() {
        return kidItemName;
    }

    public void setKidItemName(String kidItemName) {
        this.kidItemName = kidItemName;
    }

    public String getKidItemType() {
        return kidItemType;
    }

    public void setKidItemType(String kidItemType) {
        this.kidItemType = kidItemType;
    }

    public double getKidItemMrp() {
        return kidItemMrp;
    }

    public void setKidItemMrp(double kidItemMrp) {
        this.kidItemMrp = kidItemMrp;
    }

    public double getKidItemPrice() {
        return kidItemPrice;
    }

    public void setKidItemPrice(double kidItemPrice) {
        this.kidItemPrice = kidItemPrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public MainCategory getMainCategory() {
        return mainCategory;
    }

    public void setMainCategory(MainCategory mainCategory) {
        this.mainCategory = mainCategory;
    }
}
