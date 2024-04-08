
package com.ProyectoWeb.domain;


import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

@Data
@Entity
@Table(name = "pago")
public class Pago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pago")
    private Long idPago;
    private int numeroTarjeta;
    private LocalDate fechaExpiracion;
    private int codigoSeguridad;
    private String titularTarjeta;
    
    public Pago(){
        
    }

    public Pago(Long idPago, int numeroTarjeta, LocalDate fechaExpiracion, int codigoSeguridad, String titularTarjeta) {
        this.idPago = idPago;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
        this.titularTarjeta = titularTarjeta;
        
    }
    
    
    


}