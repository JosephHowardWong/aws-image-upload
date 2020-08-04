package com.josephhowardwong.awsimageupload.datastore;


import com.josephhowardwong.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("d9f0e360-10c1-43f4-beca-9351dfad58d0"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("0bb7fcb1-1565-49e8-9522-39e83cdf9a9a"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
