package com.spring.petfinder.repositories;

import com.spring.petfinder.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {

    Users findByEmail (String email);

}
