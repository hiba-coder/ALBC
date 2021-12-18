package com.ensias.albc.dao;

import com.ensias.albc.model.Search;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SearchDAO extends JpaRepository<Search,Integer> {

    @Query("select s from Search s")
    List<Search> findAll();

    @Query("select s from Search s where s.id_user = ?1")
    List<Search> findHistoriqDeRecherch(int id_user);

}
