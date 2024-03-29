package com.zettamine.mi.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zettamine.mi.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Serializable> {
	
	Optional<Users> findByUserNameAndPassword(String userName, String password);

}
