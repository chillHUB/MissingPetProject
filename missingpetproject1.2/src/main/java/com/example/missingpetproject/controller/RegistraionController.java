package com.example.missingpetproject.controller;


import com.example.missingpetproject.model.User;
import com.example.missingpetproject.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author k00266775
 */
@Controller
public class RegistraionController {
    @Autowired
    LoginRepository loginRepo;
    @GetMapping("/registration")
    public String registrationPage(Model model, User user){
            model.addAttribute(user);
    return "registration";
    }
    @PostMapping("/registration")
    public String registerUser(Model model, User user){
     loginRepo.save(user);
     model.addAttribute("User", user);
     return "index";
    }
}
