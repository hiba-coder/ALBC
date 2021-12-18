package com.ensias.albc.RestController;

import com.ensias.albc.model.Search;
import com.ensias.albc.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class searchRestController {

    @Autowired
    SearchService searchService;

    public List<Search> findAllSearch(){
        return searchService.findAllSearch();
    }
    public List<Search> searchByname(int id_user){
        return searchService.searchByname(id_user);
    }
}
