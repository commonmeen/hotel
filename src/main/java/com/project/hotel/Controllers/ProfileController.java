package com.project.hotel.Controllers;

import com.project.hotel.Entities.Packages;
import com.project.hotel.Entities.Profiles;
import com.project.hotel.Services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProfileController {
    @Autowired
    ProfileService profileService;

    @PostMapping("/save/profiles")
    public ResponseEntity<?> createProfiles(@RequestBody List<Profiles> profiles) {
        if(!CollectionUtils.isEmpty(profiles)){
            boolean res = profileService.saveProfile(profiles);
            if (res) {
                return new ResponseEntity<String>("Save profiles success.", HttpStatus.OK);
            } else {
                return new ResponseEntity<String>("Error!! can not save profiles.", HttpStatus.BAD_REQUEST);
            }
        } else {
            return new ResponseEntity<String>("Error!! can not save profiles.", HttpStatus.BAD_REQUEST);
        }
    }
}
