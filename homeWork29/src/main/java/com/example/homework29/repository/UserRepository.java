package com.example.homework29.repository;

import com.example.homework29.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Component
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByName(String name);
}
