package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity //Le dice a JPA "Esto es una Tabla"
@Getter
@Setter
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;

    public Cliente(){
        //Constructor vacío
        //JPA Lo necesita
    }
    //Los Getter and Setter ya están creados

}
