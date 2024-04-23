
package com.ProyectoWeb.service.impl;


import com.ProyectoWeb.dao.PagoDao;
import com.ProyectoWeb.domain.Pago;
import com.ProyectoWeb.service.PagoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PagoSeviceImpl implements PagoService{
    
      @Autowired
    private PagoDao pagoDao;

     @Override
    @Transactional(readOnly = true)
    public List<Pago> getPagos(boolean activos) {
       var lista = pagoDao.findAll();
        
        return lista;
    }
    
    
    @Override
    @Transactional(readOnly = true)
    public Pago getPago(Pago pago) {
        return pagoDao.findById(pago.getIdPago()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Pago pago) {
        pagoDao.save(pago);
    }
    

    
}
