package ua.pvl.springmvc.dao;

import java.util.List;

import ua.pvl.springmvc.model.UserProfile;


public interface UserProfileDao {

    List<UserProfile> findAll();

    UserProfile findByType(String type);

    UserProfile findById(int id);
}
