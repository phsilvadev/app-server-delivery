package com.server.delivery.common.dto;

import jakarta.validation.constraints.Email;

public class UserBaseDto {

    private int id;
    
    private String name; 

    @Email(message = "Email deve ser válido")
    private String email; 
    private String password; 

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }
}
