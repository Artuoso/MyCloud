package com.snow.service;

import com.snow.entity.UserDemo;

/**
 *
 *
 * @author Created by zc on 2019/11/27
 */
public interface IUserService {
    UserDemo getUserInfo(Long id, String name);
}
