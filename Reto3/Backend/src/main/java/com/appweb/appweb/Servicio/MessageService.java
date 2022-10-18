package com.appweb.appweb.Servicio;

import com.appweb.appweb.Entidad.Message;
import com.appweb.appweb.Repositorio.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService{

    @Autowired
    private MessageRepository repository;

    // Petición GET
    public List<Message> getMessages(){
        return repository.findAll();
    }

    // Petición POST
    public Message saveMessage(Message message){
        return repository.save(message);
    }
}
