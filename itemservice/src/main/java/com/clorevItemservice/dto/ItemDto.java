package com.clorevItemservice.dto;

import com.clorevItemservice.entities.Household;
import com.clorevItemservice.entities.Kid;
import com.clorevItemservice.entities.Man;
import com.clorevItemservice.entities.Woman;

import java.util.ArrayList;
import java.util.List;

public class ItemDto {

    private Integer mainId;

    private String mainCategoryName;


    private List<Man> manItemList = new ArrayList<>();

    private List<Woman> womanItemList = new ArrayList<>();

    private List<Kid> kidItemList = new ArrayList<>();

    private List<Household> householdList = new ArrayList<>();

//    private Integer householdItemId;

//    private Integer dailyWearManId;

//    private double dvmMaxRetailPrice;

//    private Integer winterWearManId;

//    private Integer ethicWearManId;


    public Integer getMainId() {
        return mainId;
    }

    public void setMainId(Integer mainId) {
        this.mainId = mainId;
    }

    public String getMainCategoryName() {
        return mainCategoryName;
    }

    public void setMainCategoryName(String mainCategoryName) {
        this.mainCategoryName = mainCategoryName;
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

    public List<Household> getHouseholdList() {
        return householdList;
    }

    public void setHouseholdList(List<Household> householdList) {
        this.householdList = householdList;
    }
}
