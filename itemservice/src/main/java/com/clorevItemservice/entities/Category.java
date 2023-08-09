package com.clorevItemservice.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @Column(name = "category_id")
    private int categoryId;

    @Column(name = "category_name")
    private String categoryName;


    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Man> manList = new ArrayList<>();


    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Woman> womanList = new ArrayList<>();


    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Kid> kidList = new ArrayList<>();
//    @JoinColumn(name = "category_fkey")
//    private List<Kid> kidList = new ArrayList<>();


    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Household> householdList = new ArrayList<>();
//    @JoinColumn( name = "category_fkey")
//    private List<Household> householdList = new ArrayList<>();

//    @ManyToOne
//    @JoinColumn(name = "main_category_fkey")
//    private MainCategory mainCategory;

//    @ManyToMany
//    private List<MainCategory> mainCategoryList = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "maincategory_id")
    private MainCategory mainCategory;

    public Category() {
    }

    public Category(int categoryId, String categoryName, List<Man> manList, List<Woman> womanList, List<Kid> kidList, List<Household> householdList, MainCategory mainCategory) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.manList = manList;
        this.womanList = womanList;
        this.kidList = kidList;
        this.householdList = householdList;
        this.mainCategory = mainCategory;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Man> getManList() {
        return manList;
    }

    public void setManList(List<Man> manList) {
        this.manList = manList;
    }

    public List<Woman> getWomanList() {
        return womanList;
    }

    public void setWomanList(List<Woman> womanList) {
        this.womanList = womanList;
    }

    public List<Kid> getKidList() {
        return kidList;
    }

    public void setKidList(List<Kid> kidList) {
        this.kidList = kidList;
    }

    public List<Household> getHouseholdList() {
        return householdList;
    }

    public void setHouseholdList(List<Household> householdList) {
        this.householdList = householdList;
    }

    public MainCategory getMainCategory() {
        return mainCategory;
    }

    public void setMainCategory(MainCategory mainCategory) {
        this.mainCategory = mainCategory;
    }
}
