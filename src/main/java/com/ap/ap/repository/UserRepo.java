package com.ap.ap.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ap.ap.models.User;

public interface UserRepo extends JpaRepository<User, Integer> {

    public Optional<User> findByEmail(String email);

}
