package com.ensias.albc.service;

import com.ensias.albc.dao.UserDAO;
import com.ensias.albc.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    UserDAO userDAO;

    public List<Users> users(){
        return userDAO.findAllUesrs();
    }
    public List<Users> usersByname(String name){
        return userDAO.findUserByName(name);
    }
}
