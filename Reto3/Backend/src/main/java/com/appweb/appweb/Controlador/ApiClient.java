package com.appweb.appweb.Controlador;

import com.appweb.appweb.Entidad.Client;
import com.appweb.appweb.Servicio.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Client/")
@CrossOrigin(origins = "*")
public class ApiClient{

    @Autowired
    private ClientService service;

    @GetMapping("/all")
    public List<Client> findAllClients(){
        return service.getClient();
    }

    @PostMapping("/save")
    public ResponseEntity saveClient(@RequestBody Client client){
        service.saveClient(client);
        return ResponseEntity.status(201).build();
    }
}
