package com.snow.controller;

import com.snow.entity.UserDemo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* 
*
* @author Created by zc on 2019/11/27
*/
@RestController
@RequestMapping("/provider")
public class UserDemoController {
    @RequestMapping("/user/{id}")
    public UserDemo getUserInfo(@PathVariable(value = "id")Long id, String name) {
        return new UserDemo(id,name);
    }
}
