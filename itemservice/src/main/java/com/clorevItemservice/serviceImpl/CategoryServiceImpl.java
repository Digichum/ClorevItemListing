package com.clorevItemservice.serviceImpl;

import com.clorevItemservice.entities.Category;
import com.clorevItemservice.repository.CategoryRepository;
import com.clorevItemservice.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;


    @Override
    public Category getCategoryById(int id) {
        return categoryRepository.findById(id).get();
    }
}

