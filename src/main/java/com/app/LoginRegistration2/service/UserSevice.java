package com.app.LoginRegistration2.service;

import com.app.LoginRegistration2.dto.LoginDto;
import com.app.LoginRegistration2.dto.SignUpDto;
import com.app.LoginRegistration2.response.ApiResponse;

public interface UserSevice {
	public ApiResponse signUp1(SignUpDto signUpDto);
    public ApiResponse login1(LoginDto loginDto);
	public void deleteById(Integer id);
}
