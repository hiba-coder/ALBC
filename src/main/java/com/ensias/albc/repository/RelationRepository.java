package com.ensias.albc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensias.albc.model.Relation;

@Repository
public interface RelationRepository extends JpaRepository<Relation, Long>{
	
	List<Relation> findByIdFollower(int idFollower);

	List<Relation> findByIdFollowed(int idFollowed);
}
