package com.example.missingpetproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author k00266775
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", updatable=false)
    private long userId;
    @Column(name="fName")
    private String fName;
    @Column(name="lName")
    private String lName;
    @Column(name="email", unique=true)
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="admin", columnDefinition="boolean default false")
    private boolean admin;

    public User() {
    }

    public User(long userId, String fName, String lName, String email, String password, boolean admin) {
        this.userId = userId;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.password = password;
        this.admin = admin;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", password=" + password + ", admin=" + admin + '}';
    }
    
}