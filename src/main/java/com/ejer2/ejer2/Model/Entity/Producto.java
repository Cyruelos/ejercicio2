package com.ejer2.ejer2.Model.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Producto {
    private int id;
    private String nombre;
    private Integer precio;
    private Integer cantidad;
    private String descripcion;
    

}
