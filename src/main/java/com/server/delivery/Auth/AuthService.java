package com.server.delivery.Auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.server.delivery.Auth.dto.SingInDto;
import com.server.delivery.Auth.dto.SingUpDto;
import com.server.delivery.User.User;
import com.server.delivery.User.UserService;

@Service
public class AuthService {
    

    @Autowired
    private UserService userService;



    public void singIn(SingInDto singInDto){

        User userResponse = this.userService.findOneByEmail(singInDto.getEmail());
        

    }

    public void singUp(SingUpDto singUpDto){
        try {
            
            this.userService.create(singUpDto);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
