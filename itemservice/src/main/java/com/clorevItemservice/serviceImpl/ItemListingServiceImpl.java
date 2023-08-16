package com.clorevItemservice.serviceImpl;

import com.clorevItemservice.dto.ItemDto;
import com.clorevItemservice.entities.*;
import com.clorevItemservice.repository.*;
import com.clorevItemservice.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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
        category.setManList(manlist);
        manlist.forEach(man ->man.setMainCategory(mainCategory));
        manlist.forEach(man -> manItemRepository.save(man));


        category.setKidList(kidList);
        category.setHouseholdList(householdList);

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
        category1.setWomanList(womenlist);
        womenlist.forEach(woman -> womanItemRepository.save(woman));

        Category category2 = new Category();
        category2.setCategoryId(3);
        category2.setCategoryName("Kid");
        category2.setMainCategory(mainCategory);
//        category1.setMainCategory(mainCategoryService.getMainCategoryById(itemDto.getMainId()));
//        category1.setWomanList(women1);
        categoryRepository.save(category2);
        kidList.forEach(kid -> kid.setCategory(category2));
        category2.setKidList(kidList);
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
        MainCategory mainCategory1 = mainCategoryRepository.findById(mainCategory.getMainId()).get();

//        Category category = new Category();
//        category.setCategoryId(1);
//        category.setCategoryName("Man");
//        categoryRepository.save(category);
//
//        Category category1 = new Category();
// //       category.setCategoryId(2);
//        category.setCategoryName("Woman");
// //       categoryRepository.save(category1);
//
//        Category category2 = new Category();
//  //      category.setCategoryId(3);
//        category.setCategoryName("Kid");
//  //      categoryRepository.save(category2);
//
//        Category category3 = new Category();
// //       category.setCategoryId(4);
//        category.setCategoryName("Household");
// //       categoryRepository.save(category3);

        List<Man>men = mainCategory.getManItemList();
        men.forEach(man -> man.setCategory(categoryRepository.findById(1).get()));
        men.forEach(man -> man.setMainCategory(mainCategory1));
        men.forEach(man -> manItemRepository.save(man));

        List<Woman> women = mainCategory.getWomanItemList();
        women.forEach(woman -> woman.setCategory(categoryRepository.findById(2).get()));
        women.forEach(woman -> woman.setMainCategory(mainCategory1));
        women.forEach(woman -> womanItemRepository.save(woman));

        List<Kid> kids = mainCategory.getKidItemList();
        kids.forEach(kid -> kid.setCategory(categoryRepository.findById(3).get()));
        kids.forEach(kid -> kid.setMainCategory(mainCategory1));
        kids.forEach(kid -> kidItemRepository.save(kid));

        List<Household> households = mainCategory.getHouseholdItemList();
        households.forEach(household -> household.setCategory(categoryRepository.findById(4).get()));
        households.forEach(household -> household.setMainCategory(mainCategory1));
        households.forEach(household -> householdItemRepository.save(household));

        return mainCategoryRepository.save(mainCategory1);
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
      public Optional<MainCategory> fetchCategories(int mainId) {
//        MainCategory mainCategory = mainCategoryRepository.findById(mainId).get();
//
//      List<Kid> kidList = mainCategory.getKidItemList();
//
//      Map<String, List<String>> totalItems = new HashMap<>();

      //        List<Category>categories = mainCategory.getCategories();
//        categories.forEach(category -> category.getCategoryId());
//        categories.forEach(category -> category.getCategoryName());

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
//        return categoryRepository.findAllByMainCategory(mainCategory);
      return mainCategoryRepository.findById(mainId);
    }

}
