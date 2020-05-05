package com.project.hotel.ServiceImplement;

import com.project.hotel.Entities.Categories;
import com.project.hotel.Repositories.CategoryRepository;
import com.project.hotel.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CategoryServiceImplement implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;


    @Override
    public boolean saveCategory(List<Categories> categories){
        try{
            for(Categories cat : categories){
                categoryRepository.save(cat);
            }
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteAll() {
        try{
            categoryRepository.deleteAll();
            return true;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
