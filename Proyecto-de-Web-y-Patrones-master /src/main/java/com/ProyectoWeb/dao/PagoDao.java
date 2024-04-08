
package com.ProyectoWeb.dao;

import com.ProyectoWeb.domain.Pago;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PagoDao extends JpaRepository<Pago, Long> {
    
}
