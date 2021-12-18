package com.ensias.albc.dao;

import com.ensias.albc.model.Relations;
import com.ensias.albc.model.Search;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RelationsDAO extends JpaRepository<Relations,Integer> {

    @Query("select r from Relations r")
    List<Relations> findAll();

    @Query("select r from Relations r where r.id_relation = ?1")
    List<Relations> findId_relation(int id_relation);

}