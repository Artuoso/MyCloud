package com.snow.entity;

/**
* User Demo
*
* @author Created by zc on 2019/11/25
*/
public class UserDemo {
    private Long id;

    private String name;

    public UserDemo() {}

    public UserDemo(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
