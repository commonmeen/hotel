package com.project.hotel.Services;

import com.project.hotel.Entities.Categories;

import java.util.List;

public interface CategoryService {
    public boolean saveCategory(List<Categories> categories);
    public boolean deleteAll();
}
