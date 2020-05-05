package com.project.hotel.ServiceImplement;

import com.project.hotel.Entities.CustomerBooking;
import com.project.hotel.Repositories.CustomerBookingRepository;
import com.project.hotel.Services.CustomerBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CustomerBookingServiceImplement implements CustomerBookingService {
    @Autowired
    CustomerBookingRepository customerBookingRepository;

    @Override
    public boolean saveCustomerBooking(List<CustomerBooking> customerBookings) {
        try {
            if(!CollectionUtils.isEmpty(customerBookings)) {
                for (CustomerBooking booking : customerBookings) {
                    customerBookingRepository.save(booking);
                }
            }
            return true;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
