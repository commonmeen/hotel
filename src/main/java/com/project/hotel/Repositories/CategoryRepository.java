package com.project.hotel.Repositories;

import com.project.hotel.Entities.Categories;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Categories,Long> {
}
