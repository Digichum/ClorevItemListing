package com.clorevItemservice.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "main_category")
public class MainCategory {

    @Id
    @Column(name = "main_id")
    private int mainId;

    @Column(name = "main_category_name")
    private String mainCategoryName;

    @OneToMany(mappedBy = "mainCategoryList")
    private List<Category> categories = new ArrayList<>();

    @OneToMany(mappedBy = "manItemList")
    private List<Man> manItemList = new ArrayList<>();

    @OneToMany(mappedBy = "womanItemList")
    private List<Woman> womanItemList = new ArrayList<>();

    @OneToMany(mappedBy = "kidItemList")
    private List<Kid> kidItemList = new ArrayList<>();

    @OneToMany(mappedBy = "householdItemList")
    private List<Household> householdItemList = new ArrayList<>();



    public MainCategory() {
    }

    public MainCategory(int mainId, String mainCategoryName, List<Category> categories, List<Man> manItemList, List<Woman> womanItemList, List<Kid> kidItemList, List<Household> householdItemList) {
        this.mainId = mainId;
        this.mainCategoryName = mainCategoryName;
        this.categories = categories;
        this.manItemList = manItemList;
        this.womanItemList = womanItemList;
        this.kidItemList = kidItemList;
        this.householdItemList = householdItemList;
    }

    public int getMainId() {
        return mainId;
    }

    public void setMainId(int mainId) {
        this.mainId = mainId;
    }

    public String getMainCategoryName() {
        return mainCategoryName;
    }

    public void setMainCategoryName(String mainCategoryName) {
        this.mainCategoryName = mainCategoryName;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Man> getManItemList() {
        return manItemList;
    }

    public void setManItemList(List<Man> manItemList) {
        this.manItemList = manItemList;
    }

    public List<Woman> getWomanItemList() {
        return womanItemList;
    }

    public void setWomanItemList(List<Woman> womanItemList) {
        this.womanItemList = womanItemList;
    }

    public List<Kid> getKidItemList() {
        return kidItemList;
    }

    public void setKidItemList(List<Kid> kidItemList) {
        this.kidItemList = kidItemList;
    }

    public List<Household> getHouseholdItemList() {
        return householdItemList;
    }

    public void setHouseholdItemList(List<Household> householdItemList) {
        this.householdItemList = householdItemList;
    }
}
