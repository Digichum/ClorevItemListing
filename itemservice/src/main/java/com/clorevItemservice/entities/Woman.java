package com.clorevItemservice.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "women")
public class Woman {

    @Id
    @Column(name = "W_Id")
    private int womanId;

    @Column(name = "W_Item")
    private String womanItemName;

    @Column(name = "W_Item_types")
    private String womanItemType;

    @Column(name = "W_MRP")
    private double womanItemMrp;

    @Column(name = "W_Price")
    private double womanItemPrice;

    @ManyToOne
    @JoinColumn(name = "Woman_category")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "maincategory_fkey")
    private MainCategory mainCategory;

    public Woman() {
    }

    public Woman(int womanId, String womanItemName, String womanItemType, double womanItemMrp, double womanItemPrice, Category category, MainCategory mainCategory) {
        this.womanId = womanId;
        this.womanItemName = womanItemName;
        this.womanItemType = womanItemType;
        this.womanItemMrp = womanItemMrp;
        this.womanItemPrice = womanItemPrice;
        this.category = category;
        this.mainCategory = mainCategory;
    }

    public int getWomanId() {
        return womanId;
    }

    public void setWomanId(int womanId) {
        this.womanId = womanId;
    }

    public String getWomanItemName() {
        return womanItemName;
    }

    public void setWomanItemName(String womanItemName) {
        this.womanItemName = womanItemName;
    }

    public String getWomanItemType() {
        return womanItemType;
    }

    public void setWomanItemType(String womanItemType) {
        this.womanItemType = womanItemType;
    }

    public double getWomanItemMrp() {
        return womanItemMrp;
    }

    public void setWomanItemMrp(double womanItemMrp) {
        this.womanItemMrp = womanItemMrp;
    }

    public double getWomanItemPrice() {
        return womanItemPrice;
    }

    public void setWomanItemPrice(double womanItemPrice) {
        this.womanItemPrice = womanItemPrice;
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
