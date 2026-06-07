package com.example.mybatisdemo.dao;

import com.example.mybatisdemo.config.UserStore;
import com.example.mybatisdemo.model.UserModel;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    private final UserStore userStore;

    public UserDao(UserStore userStore) {
        this.userStore = userStore;
    }

    public UserModel findById(Long id) {
        return userStore.getUsers().stream()
                .filter(user -> id.equals(user.getId()))
                .findFirst()
                .orElse(null);
    }

}
