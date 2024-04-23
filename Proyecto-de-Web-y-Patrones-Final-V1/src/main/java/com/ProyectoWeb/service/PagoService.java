
package com.ProyectoWeb.service;

import com.ProyectoWeb.domain.Pago;
import java.util.List;

public interface PagoService {
     public List<Pago> getPagos(boolean activos);
    
    public Pago getPago(Pago pago);
  
    public void save(Pago pago);
}