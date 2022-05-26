package jack.jtaipe.dao;

import jack.jtaipe.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IPersonaDao extends JpaRepository<Persona,Long> {
    @Query("SELECT p FROM Persona p WHERE p.nombre = ?1")
    Persona buscarPersona(String nombre);

    Persona findBynombre(String nombre);




}
