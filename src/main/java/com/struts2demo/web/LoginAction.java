package com.struts2demo.web;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2demo.dao.UserDAO;
import com.struts2demo.dto.User;

public class LoginAction extends ActionSupport {
    private UserDAO userDAO;
    private User user;
     
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
 
    public void setUser(User user) {
        this.user = user;
    }
     
    public User getUser() {
        return user;
    }
 
    public String execute() {
        if (userDAO.checkLogin(user)) {
            return SUCCESS;
        }
         
        return ERROR;
    }
}