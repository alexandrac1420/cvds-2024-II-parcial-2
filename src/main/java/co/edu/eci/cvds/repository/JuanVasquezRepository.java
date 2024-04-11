package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.JuanVasquez;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JuanVasquezRepository extends JpaRepository<JuanVasquez, String> {
    public List<JuanVasquez> findByPregunta(String pregunta);
}