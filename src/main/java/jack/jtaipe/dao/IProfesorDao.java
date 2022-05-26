package jack.jtaipe.dao;

import jack.jtaipe.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProfesorDao extends JpaRepository<Profesor,String> {

}
