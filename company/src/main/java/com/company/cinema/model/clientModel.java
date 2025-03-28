package com.company.cinema.model;

import org.springframework.data.annotation.Id;

public class clientModel {
    @Id
    public String id;
    public String firstName;
    public String lastName;
    public String edad;
    public String email;
    public String isClient;

    public clientModel() {}
    public clientModel(String id, String firstName, String lastName, String edad, String email, String isClient){
        this.firstName = firstName;
        this.lastName = lastName;
        this.edad = edad;
        this.email = email;
        this.isClient = isClient;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEdad(){
        return edad;
    }

    public void setEdad(){
        this.edad = edad;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(){
        this.email = email;
    }

    public String getIsClient(){
        return isClient;
    }

    public void setIsClient(){
        this.isClient = isClient;
    }
}
