/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.missingpetproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author User
 */
@Entity
public class Ad {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="adId", updatable=false)
    private long adId;
    @Column(name="petName")
    private String petName;
    @Column(name="petGender")
    private String petGender;
    @Column(name="petDescription")
    private String petDescription; 
    @Column(name="imageLink")
    private String imageLink;
    
    public Ad() {
    }

    public Ad(long adId, String petName, String petGender, String petDescription, String imageLink) {
        this.adId = adId;
        this.petName = petName;
        this.petGender = petGender;
        this.petDescription = petDescription;
        this.imageLink = imageLink;
    }

    public long getAdId() {
        return adId;
    }

    public void setAdId(long adId) {
        this.adId = adId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetGender() {
        return petGender;
    }

    public void setPetGender(String petGender) {
        this.petGender = petGender;
    }

    public String getPetDescription() {
        return petDescription;
    }

    public void setPetDescription(String petDescription) {
        this.petDescription = petDescription;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    @Override
    public String toString() {
        return "Ad{" + "adId=" + adId + ", petName=" + petName + ", petGender=" + petGender + ", petDescription=" + petDescription + ", imageLink=" + imageLink + '}';
    }
    
   
}
