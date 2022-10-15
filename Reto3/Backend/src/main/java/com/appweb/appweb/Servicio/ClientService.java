package com.appweb.appweb.Servicio;

import com.appweb.appweb.Entidad.Client;
import com.appweb.appweb.Repositorio.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    // Petición Get
    public List<Client> getClient(){
        return repository.findAll();
    }

    // Petición Post
    public Client saveClient(Client client){
        return repository.save(client); // Evaluarlo
    }
}