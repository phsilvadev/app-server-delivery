package com.server.delivery.Auth.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;


public class SingUpDto {
    
    @NotEmpty(message = "Nome não pode está fazio")
    private String name;

    @NotEmpty(message = "Não pode está vazio")
    @Email(message = "dados Incorretos")
    private String email;
    
    @NotEmpty(message = "Não pode ser vazio")
    private String password;

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
