package com.clorevItemservice.serviceImpl;

import com.clorevItemservice.dto.ItemDto;
import com.clorevItemservice.entities.*;
import com.clorevItemservice.repository.*;
import com.clorevItemservice.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ItemListingServiceImpl implements ItemlistingService {

    @Autowired
    MainCategoryRepository mainCategoryRepository;

    @Autowired
    CategoryService categoryService;

    @Autowired
    WomanItemRepository womanItemRepository;

    @Autowired
    KidItemRepository kidItemRepository;

    @Autowired
    HouseholdItemRepository householdItemRepository;

    @Autowired
    MainCategoryService mainCategoryService;

    @Autowired
    ManItemService manItemService;

    @Autowired
    ManItemRepository manItemRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public void saveItem(ItemDto itemDto) {

        List<String> itemList = new ArrayList<>();

//        Category category = new Category();
//        category.setMainCategory(mainCategoryService.getMainCategoryById(itemDto.getMainId()));
//        categoryRepository.save(category);

//        Man man = new Man();
//        man.setManItemId(itemDto.getManItemId());
////        man.setManItemId(manItemService.getManItemById(itemDto.getManItemId()));
////        man.setDailyWearManList(dailyWearManService.getDailywearManList(itemDto.getDailyWearManId()));
//        man.setCategory(categoryService.getCategoryById(itemDto.getCategoryId()));
//        manItemRepository.save(man);

        MainCategory mainCategory = mainCategoryService.getMainCategoryById(itemDto.getMainId());

//        MainCategory mainCategory = mainCategoryService.getMainCategoryById(itemDto.getMainId());

//        List<Man> man1 = manItemRepository.saveAll(itemDto.getManItemList());
//        List<Woman>women1 =womanItemRepository.saveAll(itemDto.getWomanItemList());

//        Man man = itemDto.getManItemList().get(0);
//        Man man2 = manItemRepository.findById(man.getManItemId()).get();
        List<Man> manlist = itemDto.getManItemList();
        List<Woman> womenlist = itemDto.getWomanItemList();
        List<Kid> kidList = itemDto.getKidItemList();
        List<Household> householdList = itemDto.getHouseholdList();



//        for(int i = 0; i<=manlist; i++)


        Category category = new Category();
        category.setCategoryId(1);
        category.setCategoryName("Man");
//        category.setMainCategory(mainCategory);

//        category.setManList(man1);
        categoryRepository.save(category);
        manlist.forEach(man -> man.setCategory(category));
        manlist.forEach(man ->man.setMainCategory(mainCategory));
        manlist.forEach(man -> manItemRepository.save(man));

//        List<Man> manList1 = mainCategory.getManItemList();
//        manList1.forEach(man -> man.setMainCategory(mainCategory));


//        Cart cart = new Cart();
//        manlist.forEach(man ->cart.setItemName(man.getManItemName()));


        Category category1 = new Category();
        category1.setCategoryId(2);
        category1.setCategoryName("Woman");
        category1.setMainCategory(mainCategory);
//        category1.setMainCategory(mainCategoryService.getMainCategoryById(itemDto.getMainId()));
//        category1.setWomanList(women1);
        categoryRepository.save(category1);
        womenlist.forEach(woman -> woman.setCategory(category1));
        womenlist.forEach(woman -> womanItemRepository.save(woman));

        Category category2 = new Category();
        category2.setCategoryId(3);
        category2.setCategoryName("Kid");
        category2.setMainCategory(mainCategory);
//        category1.setMainCategory(mainCategoryService.getMainCategoryById(itemDto.getMainId()));
//        category1.setWomanList(women1);
        categoryRepository.save(category2);
        kidList.forEach(kid -> kid.setCategory(category2));
        kidList.forEach(kid -> kidItemRepository.save(kid));
//        kidList.forEach(kid -> kidItemRepository.findById(kid.getKidItemId()));
//        for(Kid kid: kidList){
//            Kid kid1 = kidItemRepository.findById(kid.getKidItemId()).get();
//            kid1.getKidItemMrp();
//            kid1.getKidItemName();
//            kid1.getKidItemPrice();
//            itemList.add(String.valueOf(kid1));
//        }


        Category category3 = new Category();
        category3.setCategoryId(4);
        category3.setCategoryName("Household");
        category3.setMainCategory(mainCategory);
//        category1.setMainCategory(mainCategoryService.getMainCategoryById(itemDto.getMainId()));
//        category1.setWomanList(women1);
        categoryRepository.save(category3);
        householdList.forEach(household -> household.setCategory(category3));
        householdList.forEach(household -> householdItemRepository.save(household));


        mainCategoryRepository.save(mainCategory);
    }

    @Override
    public Man saveItemtoDatabase(Man man) {

//        Category category = new Category();
//        category.setCategoryName(man.getCategory().getCategoryName());
//        category.setCategoryId(man.getCategory().getCategoryId());
//        category.setMainCategory(man.getCategory().getMainCategory());
//        categoryRepository.save(category);
////        category.setMainCategory(man.getCategory().getMainCategory());
////        categoryRepository.save(category);

        return manItemRepository.save(man);
    }

    @Override
    public Woman saveWomanItemstoDatabase(Woman woman) {

//        Category category = new Category();
//        category.setCategoryId(woman.getCategory().getCategoryId());
//        category.setCategoryName(woman.getCategory().getCategoryName());
//        category.setMainCategory(woman.getCategory().getMainCategory());
//        categoryRepository.save(category);

        return womanItemRepository.save(woman);
    }

    @Override
    public MainCategory saveItemsInDatabase(MainCategory mainCategory) {

//        Category category1 = new Category();
//        category1.setManList(mainCategory.getCategories());
        MainCategory mainCategory1 = new MainCategory();
        mainCategory1.setMainId(mainCategory.getMainId());
        mainCategory1.setMainCategoryName(mainCategory.getMainCategoryName());
        mainCategoryRepository.save(mainCategory1);

        Category category = new Category();
        category.setCategoryName(mainCategory.getMainCategoryName());
        category.setMainCategory(mainCategory1);

        Man man= new Man();
        man.setManItemName("");



        return mainCategoryRepository.save(mainCategory);
    }

    @Override
    public Category saveCategoryWithItems(Category category) {
//        Category category1 = new Category();
//        category1.setCategoryId(category.getCategoryId());
//        category1.setManList(category.getManList());
//        categoryRepository.save(category1);
//
//        Category category2 = new Category();
//        category2.setWomanList(category.getWomanList());
//        categoryRepository.save(category2);
        return categoryRepository.save(category);
    }

  @Override
      public List<Category> fetchCategories(int mainId) {
        MainCategory mainCategory = mainCategoryRepository.findById(mainId).get();
      //        categoryList.forEach(category -> category.getKidList());
//        for(Category category: categoryList){
//            category.getMainCategory();
//            category.getCategoryId();
//            category.getCategoryName();
//            category.getManList();
//            category.getWomanList();
//            category.getHouseholdList();
//            category.getKidList();
//        }
        return categoryRepository.findAllByMainCategory(mainCategory);
    }

}
