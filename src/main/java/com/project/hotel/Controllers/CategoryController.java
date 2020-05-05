package com.project.hotel.Controllers;

import com.project.hotel.Entities.Categories;
import com.project.hotel.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/")
    public String test() {
        return "Hello world";
    }

    @PostMapping("/save/categories")
    public ResponseEntity<?> createCategories (@RequestBody List<Categories> categories){
        if(!CollectionUtils.isEmpty(categories)) {
            boolean res = categoryService.saveCategory(categories);
            if (res) {
                return new ResponseEntity<String>("Save category success.", HttpStatus.OK);
            } else {
                return new ResponseEntity<String>("Error!! can not save categories.", HttpStatus.BAD_REQUEST);
            }
        } else {
            return new ResponseEntity<String>("Error!! can not save categories.", HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/delete/category/all")
    public ResponseEntity<?> deleteAll () {
        boolean res = categoryService.deleteAll();
        if(res) {
            return new ResponseEntity<String>("Delete all category success.", HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("Error!! can not delete category.", HttpStatus.BAD_REQUEST);
        }
    }
}
