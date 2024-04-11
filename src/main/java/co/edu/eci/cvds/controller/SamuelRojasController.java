package co.edu.eci.cvds.controller;

import co.edu.eci.cvds.model.SamuelRojas;
import co.edu.eci.cvds.service.SamuelRojasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/samuel_rojas")
public class SamuelRojasController {

    private final SamuelRojasService samuelRojasService;

    @Autowired
    public SamuelRojasController(SamuelRojasService samuelRojasService) {
        this.samuelRojasService = samuelRojasService;
    }

    // @GetMapping("/example")
    // public String example(Model model) {
    //     model.addAttribute("premio", samuelRojasService.getPremio());
    //     return "example";
    // }

    @GetMapping("/example/api")
    public String exampleApi() {
        return "samuel_rojas";
    }

    @GetMapping("/example/api/samuel_rojas")
    @ResponseBody
    public List<SamuelRojas> exampleApiValues() {
        return samuelRojasService.getAllValues();
    }

    // @PostMapping("/example/api/samuel")
    // @ResponseBody
    // public List<Configuration> exampleApiConfigurations(@RequestBody Configuration configuration) {
    //     samuelRojasService.addConfiguration(configuration);
    //     return samuelRojasService.getAllValues();
    // }
}
