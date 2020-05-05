package com.project.hotel.Repositories;

import com.project.hotel.Entities.Categories;
import com.project.hotel.Entities.CustomerBooking;
import org.springframework.data.repository.CrudRepository;

public interface CustomerBookingRepository extends CrudRepository<CustomerBooking,Long> {
}
