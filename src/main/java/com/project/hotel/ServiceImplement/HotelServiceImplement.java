package com.project.hotel.ServiceImplement;

import com.project.hotel.Entities.Hotels;
import com.project.hotel.Repositories.HotelRepository;
import com.project.hotel.Services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class HotelServiceImplement implements HotelService {
    @Autowired
    HotelRepository hotelRepository;

    @Override
    public boolean saveHotel(List<Hotels> hotels) {
        try {
            for(Hotels hotel : hotels) {
                hotelRepository.save(hotel);
            }
            return true;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteHotelAll() {
        try {
            hotelRepository.deleteAll();
            return true;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
