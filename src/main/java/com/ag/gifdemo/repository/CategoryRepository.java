package com.ag.gifdemo.repository;

import com.ag.gifdemo.model.Category;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CategoryRepository {

    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(0,"funny"),
            new Category(1,"sport"),
            new Category(2,"it")
    );

    public List<Category> getAllCategories(){
        return ALL_CATEGORIES;
    }
}
