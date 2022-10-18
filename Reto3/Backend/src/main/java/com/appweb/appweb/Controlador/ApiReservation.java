package com.appweb.appweb.Controlador;

import com.appweb.appweb.Entidad.Reservation;
import com.appweb.appweb.Servicio.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/Reservation/")
public class ApiReservation{

    @Autowired
    private ReservationService service;

    @GetMapping("/all")
    public List<Reservation> findAllReservations(){
        return service.getReservations();
    }

    @PostMapping("/save")
    public ResponseEntity saveReservation(@RequestBody Reservation reservation){
        service.saveReservation(reservation);
        return ResponseEntity.status(201).build();
    }
}
