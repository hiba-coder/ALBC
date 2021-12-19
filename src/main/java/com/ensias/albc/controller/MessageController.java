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

import com.ensias.albc.model.Message;
import com.ensias.albc.service.MessageService;

@RestController
@RequestMapping("/message")
public class MessageController {
	
	private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }
    
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Message> getMessages(){
        return messageService.getMessages();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Message getMessageById(@PathVariable Long id){
        return messageService.getMessageById(id).orElse(null);
    }

    @GetMapping("/sender/{sender}")
    @ResponseStatus(HttpStatus.OK)
    public List<Message> getMessageByIdSender(@PathVariable int sender){
        return messageService.getMessageByIdSender(sender);
    }
    
    @GetMapping("/receiver/{receiver}")
    @ResponseStatus(HttpStatus.OK)
    public List<Message> getMessageByIdReceiver(@PathVariable int receiver){
        return messageService.getMessageByIdReceiver(receiver);
    }
    
    @GetMapping("/message/{message}")
    @ResponseStatus(HttpStatus.OK)
    public List<Message> getMessageByMessageContent(@PathVariable String message){
        return messageService.getMessageByMessageContent(message);
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Message saveMessage(@RequestBody Message m){
        return messageService.addMessage(m);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Message updateMessage(Message m){
        return messageService.updateMessage(m);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String deleteMessage(@PathVariable Long  id){
        return messageService.deleteMessageById(id);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public String deleteAll(){
        return messageService.deleteAllMessages();
    }
}
