package com.ensias.albc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ensias.albc.model.Message;
import com.ensias.albc.repository.MessageRepository;

@Service
public class MessageService {
	private final MessageRepository messageRepository;
	
	public MessageService(MessageRepository messageRepository) {
		this.messageRepository = messageRepository;
	}
	
	public List<Message> getMessages(){
    	List<Message> allMessages = messageRepository.findAll();
        //if(CollectionUtils.isNotEmpty(allMessages)){
        //return allMessages;
        //}
		return allMessages;      
    }

    public Optional<Message> getMessageById(Long id){
        return messageRepository.findById(id);
    }
    
    public List<Message> getMessageByIdSender(int id){
        List<Message> messages = messageRepository.findByIdSender(id);
            return messages;
    }
    
    public List<Message> getMessageByIdReceiver(int id){
        List<Message> messages = messageRepository.findByIdReceiver(id);
            return messages;
    }
    
    public List<Message> getMessageByMessageContent(String msg){
        List<Message> messages = messageRepository.findByMessage(msg);
            return messages;
    }
    
	public Message addMessage(Message m){
        return messageRepository.save(m);
    }
	
    public Message updateMessage(Message m){
        return messageRepository.save(m);
    }

    public String deleteMessageById(Long id){
    	messageRepository.deleteById(id);
        return "Message "+id+" has been deleted successfully";
    }

    public String deleteAllMessages(){
    	messageRepository.deleteAll();
        return "All Messages have been deleted successfully";
    }
}
