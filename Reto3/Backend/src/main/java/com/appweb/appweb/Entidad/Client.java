package com.appweb.appweb.Entidad;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "client") //javax.persistence
public class Client {
    @Id
    @GeneratedValue
    private long idClient;
    private String email;
    private String password;
    private String name;
    private int age;

    // Relación con el objeto Message
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "client")
    @JsonIgnoreProperties("client")
    private List<Message> messages;

    // Relación con el objeto Reservation
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "client")
    @JsonIgnoreProperties("client")
    private List<Reservation> reservations;
}