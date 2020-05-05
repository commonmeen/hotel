package com.project.hotel.Controllers;

import com.project.hotel.Entities.Hotels;
import com.project.hotel.Entities.PackageAvailable;
import com.project.hotel.Entities.Packages;
import com.project.hotel.Services.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class PackageController {
    @Autowired
    PackageService packageService;

    @PostMapping("/save/packages")
    public ResponseEntity<?> createPackages(@RequestBody List<Packages> packages) {
        if(!CollectionUtils.isEmpty(packages)){
            boolean res = packageService.savePackage(packages);
            if (res) {
                return new ResponseEntity<String>("Save packages success.", HttpStatus.OK);
            } else {
                return new ResponseEntity<String>("Error!! can not save packages.", HttpStatus.BAD_REQUEST);
            }
        } else {
            return new ResponseEntity<String>("Error!! can not save packages.", HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/save/packageAvailable")
    public ResponseEntity<?> createPackagesAvailable(@RequestBody List<PackageAvailable> packageAvailable) {
        if(!CollectionUtils.isEmpty(packageAvailable)){
            boolean res = packageService.savePackageAvailable(packageAvailable);
            if (res) {
                return new ResponseEntity<String>("Save packages success.", HttpStatus.OK);
            } else {
                return new ResponseEntity<String>("Error!! can not save packages.", HttpStatus.BAD_REQUEST);
            }
        } else {
            return new ResponseEntity<String>("Error!! can not save packages.", HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/delete/package/all")
    public ResponseEntity<?> deleteAllHotels() {
        boolean res = packageService.deleteAllPackage();
        if (res) {
            return new ResponseEntity<String>("Delete all packages success.", HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("Error!! can not packages hotels.", HttpStatus.BAD_REQUEST);
        }
    }

}
