package com.project.hotel.Repositories;

import com.project.hotel.Entities.Hotels;
import org.springframework.data.repository.CrudRepository;

public interface HotelRepository extends CrudRepository<Hotels,Long> {
}
