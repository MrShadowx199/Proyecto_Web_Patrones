
package com.ProyectoWeb.controller;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/cirugia")
public class CirugiaController {
    
    @GetMapping("/listado")
    public String listado(Model model) {
        return "/cirugia/listado";
    }
    
}
