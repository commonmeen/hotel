package com.project.hotel.Controllers;

import com.project.hotel.Entities.CustomerBooking;
import com.project.hotel.Entities.Hotels;
import com.project.hotel.Services.CustomerBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class CustomerBookingController {
    @Autowired
    CustomerBookingService customerBookingService;

    @PostMapping("/save/booking")
    public ResponseEntity<?> createBooking(@RequestBody List<CustomerBooking> customerBookings) {
        if(!CollectionUtils.isEmpty(customerBookings)){
            boolean res = customerBookingService.saveCustomerBooking(customerBookings);
            if (res) {
                return new ResponseEntity<String>("Save booking success.", HttpStatus.OK);
            } else {
                return new ResponseEntity<String>("Error!! can not save booking.", HttpStatus.BAD_REQUEST);
            }
        } else {
            return new ResponseEntity<String>("Error!! can not save booking.", HttpStatus.BAD_REQUEST);
        }
    }
}
