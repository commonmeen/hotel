package com.project.hotel.Repositories;

import com.project.hotel.Entities.PackageAvailable;
import com.project.hotel.Entities.Packages;
import org.springframework.data.repository.CrudRepository;

public interface PackageAvailableRepository extends CrudRepository<PackageAvailable,Long> {
}
