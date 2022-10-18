package com.appweb.appweb.Entidad;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "message") //javax.persistence
public class Message{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMessage;
    private String messageText;

    // Relación con el objeto Room
    @ManyToOne
    @JoinColumn(name =  "message_id_room")
    @JsonIgnoreProperties("messages")
    private Room room;

    // Relación con el Objeto Client
    @ManyToOne
    @JoinColumn(name =  "message_id_client")
    @JsonIgnoreProperties("messages")
    private Client client;
}