package com.clorevItemservice.serviceImpl;

import com.clorevItemservice.entities.MainCategory;
import com.clorevItemservice.repository.MainCategoryRepository;
import com.clorevItemservice.service.MainCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainCategoryServiceImpl implements MainCategoryService {

    @Autowired
    MainCategoryRepository mainCategoryRepository;

    @Override
    public MainCategory getMainCategoryById(int id) {
        return mainCategoryRepository.findById(id).get() ;
    }
}
