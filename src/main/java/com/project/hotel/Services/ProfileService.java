package com.project.hotel.Services;

import com.project.hotel.Entities.Packages;
import com.project.hotel.Entities.Profiles;

import java.util.List;

public interface ProfileService {
    public boolean saveProfile (List<Profiles> profiles);
}
