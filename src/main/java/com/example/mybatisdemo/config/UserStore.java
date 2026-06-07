package com.example.mybatisdemo.config;

import com.example.mybatisdemo.model.UserModel;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "demo")
public class UserStore {

    private List<UserModel> users = new ArrayList<>();

    public List<UserModel> getUsers() {
        return users;
    }

    public void setUsers(List<UserModel> users) {
        this.users = users;
    }

}
