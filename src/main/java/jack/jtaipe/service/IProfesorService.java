package jack.jtaipe.service;

import jack.jtaipe.entity.Profesor;

import java.util.List;

public interface IProfesorService {

    List<Profesor> listaProfesor();

    Profesor obtenerProfesorBysalario(String salario );

}
