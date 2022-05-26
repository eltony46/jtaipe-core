package jack.jtaipe.dao;

import jack.jtaipe.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IEstudianteDao extends JpaRepository<Estudiante,String> {

    @Query("SELECT p FROM Estudiante p WHERE p.nombre = ?1")
    Estudiante buscarEstudiante(String nombre);

    Estudiante findBynombre(String codigo);
}
