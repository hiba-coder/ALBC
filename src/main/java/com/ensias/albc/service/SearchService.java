package com.ensias.albc.service;

import com.ensias.albc.dao.SearchDAO;
import com.ensias.albc.model.Search;
import com.ensias.albc.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {
    @Autowired
    SearchDAO searchDAO;


    public List<Search> findAllSearch(){
        return searchDAO.findAll();
    }
    public List<Search> searchByname(int id_user){
        return searchDAO.findHistoriqDeRecherch(id_user);
    }


}
