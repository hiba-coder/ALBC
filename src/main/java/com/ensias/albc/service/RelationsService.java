package com.ensias.albc.service;

import com.ensias.albc.dao.RelationsDAO;
import com.ensias.albc.model.Relations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelationsService {
    @Autowired
    RelationsDAO relationsDAO;


    public List<Relations> findAll(){
        return relationsDAO.findAll();
    }

    public List<Relations> findId_relation(int id_relation){
        return relationsDAO.findId_relation(id_relation);
    }
}
