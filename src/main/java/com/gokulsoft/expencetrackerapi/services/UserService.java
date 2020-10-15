package com.gokulsoft.expencetrackerapi.services;

import com.gokulsoft.expencetrackerapi.domain.User;
import com.gokulsoft.expencetrackerapi.exceptions.EtAuthException;

public interface UserService {
	User validateUser(String email,String password) throws EtAuthException;
	
	User reisterUser(String firstName,String lastName,String email,String password) throws EtAuthException;
	
}
