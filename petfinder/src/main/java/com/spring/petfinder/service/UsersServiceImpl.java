package com.spring.petfinder.service;

import com.spring.petfinder.dto.UsersDTO;
import com.spring.petfinder.model.Users;
import com.spring.petfinder.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public Users save(UsersDTO usersDTO) {
        Users users = new Users(usersDTO.getEmail(), passwordEncoder.encode(usersDTO.getPassword()), usersDTO.getFname(), usersDTO.getLname(), usersDTO.getContact(), usersDTO.getRole());
        return usersRepository.save(users);
    }
}