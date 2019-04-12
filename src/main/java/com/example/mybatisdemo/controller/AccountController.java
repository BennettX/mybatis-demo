package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.model.dto.RegisterDto;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xhj
 */
@Component
@RequestMapping("**/account")
public class AccountController {

    @PostMapping("register")
    public String register(@RequestBody RegisterDto dto){



        String s = "" +
                "";
        return "";
    }
}
