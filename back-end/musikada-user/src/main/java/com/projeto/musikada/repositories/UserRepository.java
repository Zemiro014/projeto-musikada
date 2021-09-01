package com.projeto.musikada.repositories;

import com.projeto.musikada.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    
}