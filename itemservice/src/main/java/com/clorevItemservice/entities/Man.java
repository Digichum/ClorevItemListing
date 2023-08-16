package com.clorevItemservice.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "men")
public class Man {

    @Id
    @Column(name = "M_Id")
    private int manItemId;

    @Column(name = "M_Item")
    private String manItemName;

    @Column(name = "M_Item_types")
    private String manItemType;

    @Column(name = "M_MRP")
    private double manItemMrp;

    @Column(name = "M_Price")
    private double manItemPrice;


    @ManyToOne
    @JoinColumn(name = "category_fkey")
    @JsonBackReference(value = "manList-mainCategory")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "main_category_fkey")
    @JsonBackReference(value = "manItemList-mainCategory")
    private MainCategory mainCategory;


    public Man() {
    }

    public Man(int manItemId, String manItemName, String manItemType, double manItemMrp, double manItemPrice, Category category, MainCategory mainCategory) {
        this.manItemId = manItemId;
        this.manItemName = manItemName;
        this.manItemType = manItemType;
        this.manItemMrp = manItemMrp;
        this.manItemPrice = manItemPrice;
        this.category = category;
        this.mainCategory = mainCategory;
    }

    public int getManItemId() {
        return manItemId;
    }

    public void setManItemId(int manItemId) {
        this.manItemId = manItemId;
    }

    public String getManItemName() {
        return manItemName;
    }

    public void setManItemName(String manItemName) {
        this.manItemName = manItemName;
    }

    public String getManItemType() {
        return manItemType;
    }

    public void setManItemType(String manItemType) {
        this.manItemType = manItemType;
    }

    public double getManItemMrp() {
        return manItemMrp;
    }

    public void setManItemMrp(double manItemMrp) {
        this.manItemMrp = manItemMrp;
    }

    public double getManItemPrice() {
        return manItemPrice;
    }

    public void setManItemPrice(double manItemPrice) {
        this.manItemPrice = manItemPrice;
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
