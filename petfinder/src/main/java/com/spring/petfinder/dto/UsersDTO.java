package com.spring.petfinder.dto;

import jakarta.persistence.Column;

public class UsersDTO {

    @Column(nullable = false, length = 30)
    private String email;

    @Column(nullable = false, length = 35)
    private String password;

    @Column(nullable = false, length = 20)
    private String fname;

    @Column(nullable = false, length = 20)
    private String lname;

    @Column(nullable = false, length = 15)
    private String contact;

    private String role;

    public UsersDTO(String email, String password, String fname, String lname, String contact, String role) {
        this.email = email;
        this.password = password;
        this.fname = fname;
        this.lname = lname;
        this.contact = contact;
        this.role = role;
    }

    // Getters and setters...

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

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
