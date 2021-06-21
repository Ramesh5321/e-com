package com.app.LoginRegistration2.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.LoginRegistration2.dto.LoginDto;
import com.app.LoginRegistration2.dto.SignUpDto;
import com.app.LoginRegistration2.entity.User;
import com.app.LoginRegistration2.repository.UserDao;
import com.app.LoginRegistration2.repository.UserDaoImpl;
import com.app.LoginRegistration2.response.ApiResponse;
@Service
public class UserServiceImpl implements UserSevice {
    @Autowired
    private UserDao userDao1;

    @Autowired
    private UserDaoImpl userDaoImpl1;
    public ApiResponse signUp1(SignUpDto signUpDto) {
        validateSignUp1(signUpDto);
        User user = new User();
        //can use Bcrypt
        BeanUtils.copyProperties(signUpDto, user);
        userDaoImpl1.save(user);
        return new ApiResponse(200, "success", user);
    }
    public ApiResponse login1(LoginDto loginDto) {
        User user = userDao1.findByUsername(loginDto.getUsername());
        if(user == null) {
            throw new RuntimeException("User does not exist.");
        }
        if(!user.getPassword().equals(loginDto.getPassword())){
            throw new RuntimeException("Password mismatch.");
        }
        return new ApiResponse(200, "Login success", null) ;

    }

    private void validateSignUp1(SignUpDto signUpDto) {
    }
	@Override
	public void deleteById(Integer id) {
	 userDao1.deleteById(id);
		
	}

	
}
