package com.server.delivery.Auth;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.server.delivery.Auth.dto.SingInDto;

import jakarta.validation.Valid;

@RestController
@RequestMapping("auth")
public class AuthController {
    
    @PostMapping("/singIn")
    public void singIn(@Valid @RequestBody SingInDto authSingInDto){
        System.out.println(authSingInDto.getEmail());
        System.out.println(authSingInDto.getPassword());
    }


    @PostMapping("/singUp")
    public void singUp () {
        
    }

}
