package com.clorevItemservice.service;

import com.clorevItemservice.dto.ItemDto;
import com.clorevItemservice.entities.Category;
import com.clorevItemservice.entities.MainCategory;
import com.clorevItemservice.entities.Man;
import com.clorevItemservice.entities.Woman;

import java.util.List;

public interface ItemlistingService {
    public void saveItem(ItemDto itemDto);

    public Man saveItemtoDatabase(Man man);

    public Woman saveWomanItemstoDatabase(Woman woman);

    public MainCategory saveItemsInDatabase(MainCategory mainCategory);

    public Category saveCategoryWithItems(Category category);


    List<Category> fetchCategories(int mainId);
}
