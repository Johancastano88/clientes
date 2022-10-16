package com.appweb.appweb.Servicio;

import com.appweb.appweb.Entidad.Reservation;
import com.appweb.appweb.Repositorio.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService{

    @Autowired
    private ReservationRepository repository;

    // Petición GET
    public List<Reservation> getReservations(){
        return repository.findAll();
    }

    // Petición POST
    public Reservation saveReservation(Reservation reservation){
        return repository.save(reservation);
    }
}