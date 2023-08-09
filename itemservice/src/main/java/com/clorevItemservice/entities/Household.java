package com.clorevItemservice.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "household")
public class Household {

    @Id
    @Column(name = "H_Id")
    private int householdId;

    @Column(name = "H_item")
    private String householdItemName;

    @Column(name = "H_Item_types")
    private String householdItemType;

    @Column(name = "H_MRP")
    private double householdItemMrp;

    @Column(name = "H_Price")
    private double householdItemPrice;

    @ManyToOne
    @JoinColumn(name = "category_household")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "main_ctg_id")
    private MainCategory mainCategory;

    public Household() {
    }

    public Household(int householdId, String householdItemName, String householdItemType, double householdItemMrp, double householdItemPrice, Category category, MainCategory mainCategory) {
        this.householdId = householdId;
        this.householdItemName = householdItemName;
        this.householdItemType = householdItemType;
        this.householdItemMrp = householdItemMrp;
        this.householdItemPrice = householdItemPrice;
        this.category = category;
        this.mainCategory = mainCategory;
    }

    public int getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(int householdId) {
        this.householdId = householdId;
    }

    public String getHouseholdItemName() {
        return householdItemName;
    }

    public void setHouseholdItemName(String householdItemName) {
        this.householdItemName = householdItemName;
    }

    public String getHouseholdItemType() {
        return householdItemType;
    }

    public void setHouseholdItemType(String householdItemType) {
        this.householdItemType = householdItemType;
    }

    public double getHouseholdItemMrp() {
        return householdItemMrp;
    }

    public void setHouseholdItemMrp(double householdItemMrp) {
        this.householdItemMrp = householdItemMrp;
    }

    public double getHouseholdItemPrice() {
        return householdItemPrice;
    }

    public void setHouseholdItemPrice(double householdItemPrice) {
        this.householdItemPrice = householdItemPrice;
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
