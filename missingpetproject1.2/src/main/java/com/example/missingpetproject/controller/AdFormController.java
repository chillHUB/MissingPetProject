/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.missingpetproject.controller;

import com.example.missingpetproject.model.Ad;
import com.example.missingpetproject.repository.AdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.Base64;
import org.springframework.util.StringUtils;

/**
 *
 * @author User
 */
@Controller
public class AdFormController {
    @Autowired
    AdRepo adRepo;
    
    @GetMapping("/adForm")
    public String AdCreation(Model model, Ad ad){
            model.addAttribute(ad);
    return "adForm";
    }
    @PostMapping("/adForm")
    public String registerAd(Model model, Ad ad){
     adRepo.save(ad);
     model.addAttribute("Ad", ad);
     return "/index";
    }
//    @Autowired
//	private AdRepo adRepo;
//	
//	public void  saveProductToDB(MultipartFile file,String name,String description
//			,int price)
//	{
//		AdRepo a = new AdRepo();
//		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
//		if(fileName.contains(".."))
//		{
//			System.out.println("not a a valid file");
//		}
//		try {
//			a.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		a.setPetDescription(description);
//		
//        a.petName(name);
//        a.setPrice(price);
//        
//        adRepo.save(a);
//	}
}

