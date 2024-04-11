package co.edu.eci.cvds.service;

import co.edu.eci.cvds.model.AlexandraCortes;
import co.edu.eci.cvds.repository.AlexandraCortesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlexandraCortesService {
    private final AlexandraCortesRepository alexandraCortesRepository;

    @Autowired
    public AlexandraCortesService(AlexandraCortesRepository alexandraCortesRepository) {
        this.alexandraCortesRepository = alexandraCortesRepository;
    }

    public List<AlexandraCortes> getAllAlexandraCortes() {
        return alexandraCortesRepository.findAll();
    }

}