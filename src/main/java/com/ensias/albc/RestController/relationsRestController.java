package com.ensias.albc.RestController;

import com.ensias.albc.model.Relations;
import com.ensias.albc.service.RelationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class relationsRestController {
    @Autowired
    RelationsService relationsService;

    @GetMapping("/findAll")
    public List<Relations> findAll(){
        return relationsService.findAll();
    }

    @GetMapping("/findId_relation/{id_relation}")
    public List<Relations> findId_relation(@PathVariable int id_relation){
        return relationsService.findId_relation(id_relation);
    }
}
