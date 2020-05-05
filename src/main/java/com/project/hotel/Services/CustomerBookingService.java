package com.project.hotel.Services;

import com.project.hotel.Entities.Categories;
import com.project.hotel.Entities.CustomerBooking;

import java.util.List;

public interface CustomerBookingService {
    public boolean saveCustomerBooking(List<CustomerBooking> customerBookings);
}
