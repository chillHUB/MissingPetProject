/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.missingpetproject.controller;

import com.example.missingpetproject.model.User;
import com.example.missingpetproject.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
   @Autowired
   LoginRepository loginRepo;

   @PostMapping("/login")
   public String logIn(@RequestParam("email") String email,
           @RequestParam("password") String password, Model model){
       User user = loginRepo.findByNameAndPassword(email, password);
       
       if(user != null){
           boolean admin = loginRepo.checkAdmin(email);
           if(admin == true){
           
           return "adminAccount";
           }
           else{
           return "userAccount";
           }
       }
       else{
            return"index";
            }
       }
   }

