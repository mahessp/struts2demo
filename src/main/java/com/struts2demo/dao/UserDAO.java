package com.struts2demo.dao;

import com.struts2demo.dto.User;

public class UserDAO {
	public boolean checkLogin(User user) {
        return user.getUsername().equals("admin")
                && user.getPassword().equals("nimda");
    }
}
