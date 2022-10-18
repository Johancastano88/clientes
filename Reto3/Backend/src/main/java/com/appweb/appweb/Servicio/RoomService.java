package com.appweb.appweb.Servicio;

import com.appweb.appweb.Entidad.Room;
import com.appweb.appweb.Repositorio.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService{

    @Autowired
    private RoomRepository repository;

    // Petición GET
    public List<Room> getRooms(){
        return repository.findAll();
    }

    // Petición POST
    public Room saveRoom(Room room){
        return repository.save(room);
    }
}