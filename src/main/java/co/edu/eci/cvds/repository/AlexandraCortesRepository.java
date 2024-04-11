package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.AlexandraCortes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlexandraCortesRepository extends JpaRepository<AlexandraCortes, String> {
    public List<AlexandraCortes> findByPregunta(String pregunta);
}
