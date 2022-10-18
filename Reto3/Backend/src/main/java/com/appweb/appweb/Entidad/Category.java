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
@Table(name = "category") //javax.persistence
public class Category{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;

    // Relación con el Objeto Room
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "category")
    @JsonIgnoreProperties("category")
    private List<Room> rooms;
}
