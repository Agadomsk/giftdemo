package com.ag.gifdemo.controller;


import com.ag.gifdemo.model.Category;
import com.ag.gifdemo.model.Gif;
import com.ag.gifdemo.repository.CategoryRepository;
import com.ag.gifdemo.repository.gifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.RedirectViewControllerRegistration;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/categories")
    public String gifCategories(ModelMap modelMap){
        // 1. wyciąganie gifów
        //  List<Gif> gifList = getAllGifs();
        List<Category> categories = categoryRepository.getAllCategories();
        // 2. Przekazanie gifów do View
       modelMap.put("categories", categories);
        // 3. Zwracanie widoku
       return "categories";
    }
}
