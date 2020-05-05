package com.project.hotel.Services;

import com.project.hotel.Entities.PackageAvailable;
import com.project.hotel.Entities.Packages;

import java.util.List;

public interface PackageService {
    public boolean savePackage (List<Packages> packages);
    public boolean savePackageAvailable (List<PackageAvailable> packageAvailable);
    public boolean deleteAllPackage ();
}
