package com.app.LoginRegistration2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.LoginRegistration2.dto.LoginDto;
import com.app.LoginRegistration2.dto.SignUpDto;
import com.app.LoginRegistration2.response.ApiResponse;
import com.app.LoginRegistration2.service.UserSevice;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserSevice userService;

    @PostMapping("/singup")
    public ApiResponse signUp(@RequestBody SignUpDto signUpDto){
        return userService.signUp1(signUpDto);
    }

    @PostMapping("/login")
    public ApiResponse login(@RequestBody LoginDto loginDto){
        return userService.login1(loginDto);
    }
   @DeleteMapping("/delete/{id}")
   public void delete(@PathVariable Integer id)
   {
	   userService.deleteById(id);
   }

}


