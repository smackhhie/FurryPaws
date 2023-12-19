package com.spring.petfinder.service;

import com.spring.petfinder.dto.UsersDTO;
import com.spring.petfinder.model.Users;

public interface UsersService {

    Users save (UsersDTO usersDTO);

}
