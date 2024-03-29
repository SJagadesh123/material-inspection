package com.zettamine.mi.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.zettamine.mi.entities.Users;
import com.zettamine.mi.repository.UsersRepository;

@Service
public class UserServiceImpl implements UserService {

	private UsersRepository usersRepo;
	
	
	public UserServiceImpl(UsersRepository usersRepo) {
		this.usersRepo = usersRepo;
	}


	@Override
	public boolean validateUser(Users user) {
		
		Optional<Users> optUser = usersRepo.findByUserNameAndPassword(user.getUserName(), user.getPassword());
		
		if(optUser.isPresent())
		{
			return true;
		}
		
		return false;
	}

}
