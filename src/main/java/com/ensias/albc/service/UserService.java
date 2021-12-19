package com.ensias.albc.service;

import java.util.List;
import java.util.Optional;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import com.ensias.albc.model.User;
import com.ensias.albc.repository.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<User> getUsers(){
    	List<User> allUsers = userRepository.findAll();
        //if(CollectionUtils.isNotEmpty(allUsers)){
        //return allUsers;
        //}
		return allUsers;      
    }

    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }
    
	public User addUser(User u){
        return userRepository.save(u);
    }
	
    public User updateUser(User u){
        return userRepository.save(u);
    }

    public String deleteUserById(Long id){
    	userRepository.deleteById(id);
        return "User "+id+" has been deleted successfully";
    }

    public String deleteAllUsers(){
    	userRepository.deleteAll();
        return "All Users have been deleted successfully";
    }
}
