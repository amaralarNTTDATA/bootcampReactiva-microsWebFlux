package com.example.tallerwebfluxservermicro.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String nombre;
    private String primerApellido;
    private int edad;

}
