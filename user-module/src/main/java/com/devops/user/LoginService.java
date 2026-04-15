package com.devops.user;

public class LoginService {

    public boolean login(User user) {
        return user.getUsername().equals("admin") &&
               user.getPassword().equals("123");
    }
}