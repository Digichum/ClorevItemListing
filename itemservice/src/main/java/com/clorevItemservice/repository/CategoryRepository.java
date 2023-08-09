package com.clorevItemservice.repository;

import com.clorevItemservice.entities.Category;
import com.clorevItemservice.entities.MainCategory;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

//    @EntityGraph(attributePaths = { "manList", "womanList", "kidList", "householdList" })
    List<Category> findAllByMainCategory(MainCategory mainCategory);
}
