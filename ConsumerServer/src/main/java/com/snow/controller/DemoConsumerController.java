package com.snow.controller;

import com.snow.entity.UserDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
* 
*
* @author Created by zc on 2019/12/1
*/
@RestController
@RequestMapping("/consumer.user")
public class DemoConsumerController {
    private static final String URL_PREFIX = "http://PROVIDER-SERVICE";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{id}")
    public UserDemo get(@PathVariable("id") Long id, String name) {
        return restTemplate.getForObject(URL_PREFIX + "/provider/user/" + id + "?name=" + name, UserDemo.class);
    }
}
