package com.appweb.appweb.Entidad;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reservartion") //javax.persistence
public class Reservation{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReservation;
    private Date startDate;
    private Date devolutionDate;
    private String created = "created";

    // Relación con Object Room
    @ManyToOne
    @JoinColumn(name = "room_id")
    @JsonIgnoreProperties("reservations")
    private Room room;

    // Relación con Object Client
    @ManyToOne
    @JoinColumn(name = "client_id")
    @JsonIgnoreProperties("reservations")
    private Client client;
}
