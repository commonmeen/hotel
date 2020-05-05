package com.project.hotel.ServiceImplement;

import com.project.hotel.Entities.PackageAvailable;
import com.project.hotel.Entities.Packages;
import com.project.hotel.Repositories.PackageAvailableRepository;
import com.project.hotel.Repositories.PackageRepository;
import com.project.hotel.Services.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PackageServiceImplement implements PackageService {
    @Autowired
    PackageRepository packageRepository;
    @Autowired
    PackageAvailableRepository packageAvailableRepository;

    @Override
    public boolean savePackage(List<Packages> packages) {
        try {
            if (!CollectionUtils.isEmpty(packages)){
                for (Packages pack : packages) {
                    packageRepository.save(pack);
                }
                return true;
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean savePackageAvailable(List<PackageAvailable> packageAvailable) {
        try {
            if (!CollectionUtils.isEmpty(packageAvailable)) {
                for (PackageAvailable pack : packageAvailable) {
                    packageAvailableRepository.save(pack);
                }
                return true;
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteAllPackage() {
        try {
            packageRepository.deleteAll();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
