package com.ensias.albc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensias.albc.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
