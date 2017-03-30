package ua.pvl.springmvc.service;

import java.util.List;

import ua.pvl.springmvc.model.UserProfile;


public interface UserProfileService {

    UserProfile findById(int id);

    UserProfile findByType(String type);

    List<UserProfile> findAll();

}
