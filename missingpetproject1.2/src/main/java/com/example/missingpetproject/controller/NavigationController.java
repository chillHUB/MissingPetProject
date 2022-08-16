package com.example.missingpetproject.controller;



import com.example.missingpetproject.repository.AdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {
    @Autowired
    AdRepo adRepo; 
    @GetMapping("")
    public String getIndex(Model model){
        model.addAttribute("ad", adRepo.findAll());
        return "index";
    }
//@GetMapping("")
//    public String getIndex(Model model){
//        model.addAttribute("activePage", "index" );
//        return "index";
//    }
    @GetMapping("/found")
    public String getFound(Model model){
        model.addAttribute("activePage", "found" );
        return "found";
    }
    @GetMapping("/login")
    public String getSignIn(Model model){
        model.addAttribute("activePage", "login" );
        return "login";
    }
    
}
