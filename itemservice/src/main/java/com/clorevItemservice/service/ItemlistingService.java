package com.clorevItemservice.service;

import com.clorevItemservice.dto.ItemDto;
import com.clorevItemservice.entities.*;

import java.util.Optional;

public interface ItemlistingService {
    public void saveItem(ItemDto itemDto);

    public Man saveItemtoDatabase(Man man);

    public Woman saveWomanItemstoDatabase(Woman woman);

    public MainCategory saveItemsInDatabase(MainCategory mainCategory);

    public Category saveCategoryWithItems(Category category);


    Optional<MainCategory> fetchCategories(int mainId);
}
