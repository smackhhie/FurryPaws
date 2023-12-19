package com.spring.petfinder.controller;

import com.spring.petfinder.dto.UsersDTO;
import com.spring.petfinder.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

@Controller
public class UsersController {

    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    private UsersService usersService;

    @GetMapping("/registration")
    public String getRegisterPage(@ModelAttribute("users") UsersDTO usersDTO) {
        return "register";
    }

    @PostMapping("/registration")
    public String saveUsers(@ModelAttribute("users") UsersDTO usersDTO, Model model) {
        usersService.save(usersDTO);
        model.addAttribute("message", "Registered Successfully");
        return "register";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/user-page")
    public String userPage(Model model, Principal principal) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
        model.addAttribute("user", userDetails);
        return "user";
    }

    @GetMapping("/admin-page")
    public String adminPage(Model model, Principal principal) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
        model.addAttribute("user", userDetails);
        return "admin";
    }

    @GetMapping("/home-page")
    public String homePage() {
        return "home";
    }

}
