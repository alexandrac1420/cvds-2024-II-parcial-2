package co.edu.eci.cvds.controller;

import co.edu.eci.cvds.model.AlexandraCortes;
import co.edu.eci.cvds.model.Configuration;
import co.edu.eci.cvds.service.AlexandraCortesService;
import co.edu.eci.cvds.service.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/alexandra_cortes")
public class AlexandraCortesController {

    private final AlexandraCortesService alexandraCortesService;

    @Autowired
    public AlexandraCortesController(AlexandraCortesService alexandraCortesService) {
        this.alexandraCortesService = alexandraCortesService;
    }

    @GetMapping("/parcial")
    public String exampleApi() {
        return "parcial";
    }

    @GetMapping("/parcial/tabla")
    @ResponseBody
    public List<AlexandraCortes> mostrarTabla() {
        return alexandraCortesService.getAllAlexandraCortes(); // Reemplaza este método con el que realmente obtiene los datos de tu servicio.
        
    }


}
