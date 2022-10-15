package com.appweb.appweb.Entidad;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "client") //javax.persistence
public class Client {
    @Id
    @GeneratedValue
    private long id;
    private String email;
    private String password;
    private String name;
    private int age;
}