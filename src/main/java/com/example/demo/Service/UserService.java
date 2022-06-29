package com.example.demo.Service;

import java.util.List;

import javax.validation.constraints.Email;

import com.example.demo.Dto.LoginDto;
import com.example.demo.Dto.RegisterDto;
import com.example.demo.Dto.UserDto;
import com.example.demo.Dto.UserJwtDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
	UserJwtDto userLogin(LoginDto input);
	UserJwtDto userRegister(RegisterDto input);
	boolean isCheckEmail(@Email String email);
	boolean isCheckUserName(String userName);
	UserDto updateUser(UserDto userDto, int idUser);
	List<UserDto> getAllUser();
	UserDto findUserByUserName(String userName);
	List<UserDto> getAllUserByLevel(int level);
	UserDto getUserById(int id);
	
}
