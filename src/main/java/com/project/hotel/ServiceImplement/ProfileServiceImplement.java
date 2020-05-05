package com.project.hotel.ServiceImplement;

import com.project.hotel.Entities.Profiles;
import com.project.hotel.Repositories.ProfileRepository;
import com.project.hotel.Services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProfileServiceImplement implements ProfileService {
    @Autowired
    ProfileRepository profileRepository;

    @Override
    public boolean saveProfile(List<Profiles> profiles) {
        try {
            if (!CollectionUtils.isEmpty(profiles)) {
                for(Profiles profile : profiles) {
                    profileRepository.save(profile);
                }
            }
            return true;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
