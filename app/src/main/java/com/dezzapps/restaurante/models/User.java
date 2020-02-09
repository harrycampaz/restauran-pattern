package com.dezzapps.restaurante.models;

public class User {
    private String name;
    private String email;
    private String password;

    private static User user = new User();

    private User(){
        this.name ="Harry Campaz";
        this.email = "harr@campaz.com";
        this.password = "4321";
    }

    public static  User getUser(){
        return user;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
