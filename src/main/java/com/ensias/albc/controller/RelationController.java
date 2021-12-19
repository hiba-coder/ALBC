package com.ensias.albc.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ensias.albc.model.Relation;
import com.ensias.albc.service.RelationService;

@RestController
@RequestMapping("/relation")
public class RelationController {
	
	private final RelationService relationService;

    public RelationController(RelationService relationService) {
        this.relationService = relationService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Relation> getRelations(){
        return relationService.getRelations();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Relation getRelationById(@PathVariable Long id){
        return relationService.getRelationById(id).orElse(null);
    }

    @GetMapping("/follower/{follower}")
    @ResponseStatus(HttpStatus.OK)
    public List<Relation> getRelationByIdFollower(@PathVariable int follower){
        return relationService.getRelationByIdFollower(follower);
    }
    
    @GetMapping("/followed/{followed}")
    @ResponseStatus(HttpStatus.OK)
    public List<Relation> getRelationByIdFollowed(@PathVariable int followed){
        return relationService.getRelationByIdFollowed(followed);
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Relation saveRelation(@RequestBody Relation r){
        return relationService.addRelation(r);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Relation updateRelation(Relation r){
        return relationService.updateRelation(r);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String deleteRelation(@PathVariable Long  id){
        return relationService.deleteRelationById(id);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public String deleteAll(){
        return relationService.deleteAllRelations();
    }
}
