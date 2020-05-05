package com.project.hotel.Services;

import com.project.hotel.Entities.Hotels;

import java.util.List;

public interface HotelService {
    public boolean saveHotel (List<Hotels> hotels);
    public boolean deleteHotelAll ();
}
