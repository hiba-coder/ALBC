package com.ensias.albc.RestController;

import com.ensias.albc.model.Search;
import com.ensias.albc.model.Users;
import com.ensias.albc.service.SearchService;
import com.ensias.albc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userRestController {

    @Autowired
    SearchService searchService;

    @GetMapping("/searchByname/{id_user}")
    public List<Search> searchByname(@PathVariable int id_user){
        return searchService.searchByname(id_user);
    }
}
