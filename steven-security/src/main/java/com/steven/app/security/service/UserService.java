package com.steven.app.security.service;

//import org.springframework.security.core.userdetails.UserDetailsService;


import com.steven.common.entity.User;

/**
 * Created by Steven on 2017/4/13.
 */
public interface UserService{
//public interface UserService extends UserDetailsService {

    public User getUserByName(String userName);

    public int saveUser(String username, String password, String role);
}
