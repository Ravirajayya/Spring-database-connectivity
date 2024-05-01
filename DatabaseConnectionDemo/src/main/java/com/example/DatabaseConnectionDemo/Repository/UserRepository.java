package com.example.DatabaseConnectionDemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DatabaseConnectionDemo.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
