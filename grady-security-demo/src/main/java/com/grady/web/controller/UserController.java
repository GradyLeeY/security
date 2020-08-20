package com.grady.web.controller;

import com.grady.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author grady
 * @date 2020 20-8-20 下午2:02
 */
@RestController
public class UserController {


    @GetMapping("/user")
    public List<User> query(){
        List<User> list = new ArrayList<>();
        list.add(new User());
        list.add(new User());
        list.add(new User());
        return list;
    }
}
