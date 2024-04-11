package co.edu.eci.cvds.controller;

import co.edu.eci.cvds.model.JuanVasquez;
import co.edu.eci.cvds.service.JuanVasquezService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/juan_vasquez")
public class JuanVasquezController {

    private final JuanVasquezService juanVasquezService;

    @Autowired
    public JuanVasquezController(JuanVasquezService juanVasquezService) {
        this.juanVasquezService = juanVasquezService;
    }

    @GetMapping("/api")
    public String apiParcial() {
        return "index";
    }

    @GetMapping("/api/respuestas")
    @ResponseBody
    public List<JuanVasquez> getRespuestas() {
        return juanVasquezService.getAllJuanVasquez();
    }
}
