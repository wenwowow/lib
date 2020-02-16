package com.wc.dao;
import com.wc.domin.User;

public interface UserDao {
	public User findUser(String userName,String userPassword);
}
