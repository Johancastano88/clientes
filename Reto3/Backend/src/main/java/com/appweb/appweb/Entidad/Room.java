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
@Table(name = "room") //javax.persistence
public class Room{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int stars;
    private String hotel;
    private String description;

    // Relación con el Objeto Category
    @ManyToOne
    @JoinColumn(name =  "category_id")
    @JsonIgnoreProperties("rooms")
    private Category category;

    // Relación con el Objeto Message
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "room")
    @JsonIgnoreProperties("room")
    private List<Message> messages;

    // Relación con el Objeto Reservation
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "room")
    @JsonIgnoreProperties("room")
    private List<Reservation> reservations;
}
