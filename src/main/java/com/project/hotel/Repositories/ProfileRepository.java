package com.project.hotel.Repositories;

import com.project.hotel.Entities.Packages;
import com.project.hotel.Entities.Profiles;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profiles,Long>  {
}
