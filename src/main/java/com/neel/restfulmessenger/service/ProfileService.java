package com.neel.restfulmessenger.service;

import com.neel.restfulmessenger.database.DatabaseClass;
import com.neel.restfulmessenger.model.Profile;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by neel on 09/22/17 5:32 PM
 */

public class ProfileService {

  private Map<String, Profile> idProfileMap = DatabaseClass.getIdProfileMap();

  public ProfileService() {
    idProfileMap.put("nikoo28", new Profile(1L, "nikoo28", "Nikhil", "Lohia"));
    idProfileMap.put("lucifer", new Profile(2L, "lucifer", "Akhil", "Lohia"));
  }

  public List<Profile> getAllProfiles() {
    return new ArrayList<Profile>(idProfileMap.values());
  }

  public Profile getProfile(String profileName) {
    return idProfileMap.get(profileName);
  }

  public Profile addProfile(Profile profile) {
    profile.setId(idProfileMap.size() + 1);
    idProfileMap.put(profile.getProfileName(), profile);
    return profile;
  }

  public Profile updateProfile(Profile profile) {

    if (profile.getProfileName().isEmpty())
      return null;

    idProfileMap.put(profile.getProfileName(), profile);
    return profile;
  }

  public Profile removeProfile(String profileName) {
    return idProfileMap.remove(profileName);
  }


}
