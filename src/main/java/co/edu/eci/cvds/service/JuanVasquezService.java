package co.edu.eci.cvds.service;
import co.edu.eci.cvds.repository.JuanVasquezRepository;
import co.edu.eci.cvds.model.JuanVasquez;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JuanVasquezService {
    private final JuanVasquezRepository juanVasquezRepository;

    @Autowired
    public JuanVasquezService(JuanVasquezRepository juanVasquezRepository) {
        this.juanVasquezRepository = juanVasquezRepository;
    }

    public List<JuanVasquez> getAllJuanVasquez() {
        return juanVasquezRepository.findAll();
    }
}