package com.ensias.albc.dao;

import com.ensias.albc.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDAO extends JpaRepository<Users,Integer> {

    @Query("select u from Users u")
    List<Users> findAllUesrs();

    @Query("select u from Users u where u.First_name like %?1% or u.Last_name like %?1%")
    List<Users> findUserByName(String name);


}
