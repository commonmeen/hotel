package com.project.hotel.Controllers;

import com.project.hotel.Entities.Hotels;
import com.project.hotel.Services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class HotelController {
    @Autowired
    HotelService hotelService;

    @PostMapping("/save/hotels")
    public ResponseEntity<?> createHotels(@RequestBody List<Hotels> hotels) {
        if(!CollectionUtils.isEmpty(hotels)){
            boolean res = hotelService.saveHotel(hotels);
            if (res) {
                return new ResponseEntity<String>("Save hotel success.", HttpStatus.OK);
            } else {
                return new ResponseEntity<String>("Error!! can not save hotels.", HttpStatus.BAD_REQUEST);
            }
        } else {
            return new ResponseEntity<String>("Error!! can not save hotels.", HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/delete/hotel/all")
    public ResponseEntity<?> deleteAllHotels() {
        boolean res = hotelService.deleteHotelAll();
        if (res) {
            return new ResponseEntity<String>("Delete all hotel success.", HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("Error!! can not delete hotels.", HttpStatus.BAD_REQUEST);
        }
    }
}
