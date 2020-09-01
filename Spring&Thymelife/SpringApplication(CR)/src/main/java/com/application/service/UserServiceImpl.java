package com.application.service;


import com.application.entity.User;
import com.application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    //Agregado ya que existio un error de logica
    @Override
    public User createUser(User formUser) throws Exception {
        return null;
    }

    @Override
    public User getUserById(Long id) throws Exception {
        return null;
    }
    //Eliminar hasta aqui cuando se solucione

    /*
    private boolean checkUsernameAvailable(User user) throws Exception {
        Optional userFound = userRepository.findByUsername(user.getUsername());
        if (userFound.isPresent()) {
            throw new Exception("Username no disponible");
        }
        return true;
    }

    private boolean checkPasswordValid(User user) throws Exception {
        if ( !user.getPassword().equals(user.getConfirmPassword())) {
            throw new Exception("Password y Confirm Password no son iguales");
        }
        return true;
    }

    @Override
    public User createUser(User user) throws Exception {
        if (checkUsernameAvailable(user) && checkPasswordValid(user)) {
            user = userRepository.save(user);
        }
        return user;
    }

    @Override
    public User getUserById(Long id) throws Exception {
        User user = userRepository.findById(id).orElseThrow(() -> new Exception("User does not exist"));
        return user;
    }
     */
}
