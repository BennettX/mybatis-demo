package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.dao.UserDao;
import com.example.mybatisdemo.model.UserModel;
import com.example.mybatisdemo.model.dto.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author xhj
 */
@Controller
@RequestMapping("**/account")
public class AccountController {

    @Resource
    private UserDao userDao;

    @PostMapping("register")
    @ResponseBody
    public DataResult register(@RequestBody @Valid UserModel model) {

        int id = userDao.insert(model);

        return DataResult.of(String.valueOf(id));
    }
}
