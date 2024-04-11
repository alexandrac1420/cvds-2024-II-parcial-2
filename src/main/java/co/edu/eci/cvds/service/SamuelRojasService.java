package co.edu.eci.cvds.service;

import co.edu.eci.cvds.model.SamuelRojas;
import co.edu.eci.cvds.repository.SamuelRojasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SamuelRojasService {
    private final SamuelRojasRepository samuelRojasRepository;

    @Autowired
    public SamuelRojasService(SamuelRojasRepository samuelRojasRepository) {
        this.samuelRojasRepository = samuelRojasRepository;
    }

    public SamuelRojas addAnswer(SamuelRojas value) {
        return samuelRojasRepository.save(value);
    }

    public SamuelRojas getAnswer(String numero) {
        return samuelRojasRepository.findByNumero(numero).get(1);
    }

    public List<SamuelRojas> getAllValues() {
        return samuelRojasRepository.findAll();
    }

    public SamuelRojas updateValue(SamuelRojas samuelRojas) {
        if (samuelRojasRepository.findByNumero(samuelRojas.getNumero()).size() == 0) {
            return samuelRojasRepository.save(samuelRojas);
        }

        return null;
    }

    public void deleteValue(String numero) {
        samuelRojasRepository.deleteById(numero);
    }

    public String getLetra() {
        return samuelRojasRepository.findByNumero("premio").get(0).getLetra();
    }
}