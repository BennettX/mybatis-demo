package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.dao.UserDao;
import com.example.mybatisdemo.model.UserModel;
import com.example.mybatisdemo.model.dto.DataResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xhj
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Resource
    private UserDao userDao;

    @GetMapping("{id}")
    public DataResult<UserModel> getUser(@PathVariable Long id) {
        UserModel user = userDao.findById(id);
        if (user == null) {
            return new DataResult<>(404, "用户不存在", null);
        }
        return DataResult.of(user);
    }

    // @PostMapping("register")
    // @ResponseBody
    // public DataResult register(@RequestBody @Valid UserModel model) {
    //
    //     int id = userDao.insert(model);
    //
    //     return DataResult.of(String.valueOf(id));
    // }
}
