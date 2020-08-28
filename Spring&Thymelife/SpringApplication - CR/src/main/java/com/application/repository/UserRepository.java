package com.application.repository;


import java.util.Optional;

import com.application.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    public Optional findByUsername(String username);
    public Optional findByIdAndPassword(Long id, String password);
}
