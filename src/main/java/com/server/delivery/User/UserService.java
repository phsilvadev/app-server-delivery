package com.server.delivery.User;

import jakarta.persistence.EntityNotFoundException;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    

    @Autowired
    private UserRepository userRepository;


    public User findOneByEmail(String email){
        return this.userRepository.findOneByEmail(email).orElseThrow(() -> new EntityNotFoundException("User not found with email: " + email));
    }

    public UUID create(User user){
        try {
            User saverUser = this.userRepository.save(user);
            return saverUser.getId();
        } catch (Exception e) {
            throw new RuntimeException("Fila em saver usuario", e);
        }
    }

}
