package com.ensias.albc.RestController;

import com.ensias.albc.model.Users;
import com.ensias.albc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userRestController {

    @Autowired
    UsersService usersService;

    @GetMapping("/findUsersByName/{name}")
    public List<Users> findUsersByName(@PathVariable String name){
        return usersService.usersByname(name);
    }
}
