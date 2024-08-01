package com.server.delivery.Auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.server.delivery.Auth.dto.SingInDto;
import com.server.delivery.Auth.dto.SingUpDto;
import com.server.delivery.User.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("auth")
public class AuthController {

    @Autowired
    private UserService userService;
    
    @PostMapping("/singIn")
    public void singIn(@Valid @RequestBody SingInDto authSingInDto){
        System.out.println(authSingInDto.getEmail());
        System.out.println(authSingInDto.getPassword());
    }


    @PostMapping("/singUp")
    @ResponseStatus(HttpStatus.OK)
    public Long singUp (@Valid @RequestBody SingUpDto singUpDto) {
        return this.userService.create(singUpDto);
    }

}
