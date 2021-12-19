package com.ensias.albc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensias.albc.model.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long>{
	
	List<Message> findByIdSender(int idSender);
	
	List<Message> findByIdReceiver(int idReceiver);
	
	List<Message> findByMessage(String message);
}
