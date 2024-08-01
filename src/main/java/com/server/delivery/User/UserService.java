package com.server.delivery.User;

import jakarta.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.server.delivery.Auth.dto.SingUpDto;

@Service
public class UserService {
    

    @Autowired
    private UserRepository userRepository;


    public User findOneByEmail(String email){
        return this.userRepository.findOneByEmail(email).orElseThrow(() -> new EntityNotFoundException("User not found with email: " + email));
    }

    public Long create(SingUpDto singUpDto){
        try {

            User user = new User();

            user.setName(singUpDto.getName());
            user.setEmail(singUpDto.getEmail());
            user.setPassword(singUpDto.getPassword());

            System.out.println(user.getEmail());

            User saverUser = this.userRepository.save(user);
            return saverUser.getId();
        } catch (Exception e) {
            throw new RuntimeException("Fila em saver usuario", e);
        }
    }

}
