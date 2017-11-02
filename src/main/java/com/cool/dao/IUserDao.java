package com.cool.dao;

import com.cool.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {
    User selectUser(String id);
}
