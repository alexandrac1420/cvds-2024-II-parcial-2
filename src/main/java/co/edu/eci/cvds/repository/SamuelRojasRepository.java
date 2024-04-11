package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.SamuelRojas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SamuelRojasRepository extends JpaRepository<SamuelRojas, String> {
    public List<SamuelRojas> findByNumero(String numero);

}