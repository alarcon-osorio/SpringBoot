package com.application.service;

import com.application.entity.User;

public interface UserService {

    public Iterable<User> getAllUsers();

    public User createUser(User formUser) throws Exception;

    User getUserById(Long id) throws Exception;

}
