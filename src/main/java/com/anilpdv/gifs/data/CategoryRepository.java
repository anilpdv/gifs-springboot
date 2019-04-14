package com.anilpdv.gifs.data;

import com.anilpdv.gifs.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(

            new Category(1,"Technology"),
            new Category(2,"People"),
            new Category(3,"Description")
    );

    public List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }
}
