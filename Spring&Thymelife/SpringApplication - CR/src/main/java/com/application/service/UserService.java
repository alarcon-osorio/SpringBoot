package com.application.service;

import com.application.entity.User;

public interface UserService {

    public Iterable<User> getAllUsers();

    public User createUser(User formUser) throws Exception;

}
