package com.clorevItemservice.controller;

import com.clorevItemservice.common.ApiResponse;
import com.clorevItemservice.dto.ItemDto;
import com.clorevItemservice.entities.*;
import com.clorevItemservice.service.ItemlistingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ItemListingController {

    @Autowired
    ItemlistingService itemlistingService;

    @PostMapping("saveAllItems")
    public MainCategory addItems(@RequestBody MainCategory mainCategory){
        return itemlistingService.saveItemsInDatabase(mainCategory);
    }

    @PostMapping("saveCategory")
    public Category addItemsWithCategory(@RequestBody Category category){
        return itemlistingService.saveCategoryWithItems(category);
    }

    @PostMapping("saveNewItems")
    public ResponseEntity<ApiResponse> addToCart(@RequestBody ItemDto itemDto){
        itemlistingService.saveItem(itemDto);
        return new ResponseEntity<>(new ApiResponse(true, "added to cart"), HttpStatus.CREATED);

    }

    @PostMapping("saveMenItems")
    public Man addItemsToDatabase(@RequestBody Man man){
        return itemlistingService.saveItemtoDatabase(man);
    }
//    public ResponseEntity<ApiResponse> addItemsToDatabase(@RequestBody Man man){
//        itemlistingService.saveItemtoDatabase(man);
//        return new ResponseEntity<>(new ApiResponse(true, "added to Db"),HttpStatus.CREATED);
//    }

    @PostMapping("saveWomenItems")
    public Woman addWomanItemsToDatabase(@RequestBody Woman woman){
        return itemlistingService.saveWomanItemstoDatabase(woman);
    }


    @GetMapping("categories/{mainId}")
    public ResponseEntity<MainCategory> getCategories(@PathVariable int mainId){
        return new ResponseEntity<MainCategory>(itemlistingService.fetchCategories(mainId).get(),HttpStatus.OK);
    }






}
