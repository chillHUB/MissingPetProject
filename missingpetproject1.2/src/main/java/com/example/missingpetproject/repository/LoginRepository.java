/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.missingpetproject.repository;

import com.example.missingpetproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author User
 */
public interface LoginRepository extends JpaRepository<User, Long> {
   @Query(value = "SELECT * FROM user WHERE email = :email and password = :password", nativeQuery = true)
User findByNameAndPassword(String email, String password);
   
   @Query(value = "SELECT admin FROM user WHERE email = :email", nativeQuery = true)
    Boolean checkAdmin(String email); 
}
