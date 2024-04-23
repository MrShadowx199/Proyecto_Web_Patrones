package com.ProyectoWeb.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "producto")

public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;
    
    private String nombre;
    private double precio;
    private int unidades;
    private boolean activo;

    public Producto() {

    }

    public Producto(Long idProducto, String nombre, double precio, int unidades, boolean activo) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.unidades = unidades;
        this.activo = activo;
    }

}
