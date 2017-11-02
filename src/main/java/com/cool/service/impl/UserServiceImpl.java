package com.cool.service.impl;

import com.cool.dao.IUserDao;
import com.cool.model.User;
import com.cool.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

    @Override
    public User selectUser(String id) {
        return userDao.selectUser(id);
    }
}
