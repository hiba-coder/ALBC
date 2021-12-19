package com.ensias.albc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ensias.albc.model.Relation;
import com.ensias.albc.repository.RelationRepository;

@Service
public class RelationService {
	private final RelationRepository relationRepository;
	
	public RelationService(RelationRepository relationRepository) {
		this.relationRepository = relationRepository;
	}
	
	public List<Relation> getRelations(){
    	List<Relation> allRelations = relationRepository.findAll();
        //if(CollectionUtils.isNotEmpty(allRelations)){
        //return allRelations;
        //}
		return allRelations;      
    }

    public Optional<Relation> getRelationById(Long id){
        return relationRepository.findById(id);
    }
    
    public List<Relation> getRelationByIdFollower(int id){
        List<Relation> relations = relationRepository.findByIdFollower(id);
            return relations;
    }
    
    public List<Relation> getRelationByIdFollowed(int id){
        List<Relation> relations = relationRepository.findByIdFollowed(id);
            return relations;
    }
    
	public Relation addRelation(Relation r){
        return relationRepository.save(r);
    }
	
    public Relation updateRelation(Relation r){
        return relationRepository.save(r);
    }

    public String deleteRelationById(Long id){
    	relationRepository.deleteById(id);
        return "Relation "+id+" has been deleted successfully";
    }

    public String deleteAllRelations(){
    	relationRepository.deleteAll();
        return "All Relations have been deleted successfully";
    }
}
