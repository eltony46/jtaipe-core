package jack.jtaipe.dao;

import jack.jtaipe.entity.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface IAsignaturaDao extends JpaRepository<Asignatura, Long> {

    Optional<Asignatura> findBycurso(String curso);
    @Query("SELECT u FROM Asignatura u WHERE u.curso= :curso")
    Asignatura findAsignaturaBycurso(@Param("curso") String curso);
}
