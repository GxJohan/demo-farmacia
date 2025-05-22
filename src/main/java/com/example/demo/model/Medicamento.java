package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity //Le dice a JPA "Esto es una Tabla"
@Getter
@Setter

@Table(name = "medicamento")

public class Medicamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private String laboratorio;

    public Medicamento(){
        //Constructor vacío
        //JPA Lo necesita
    }
    //Los Getter and Setter ya están creados

}
