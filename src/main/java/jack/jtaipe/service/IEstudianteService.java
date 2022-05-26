package jack.jtaipe.service;

import jack.jtaipe.entity.Estudiante;

import java.util.List;

public interface IEstudianteService {
    List<Estudiante> listaEstudiantes();



    Estudiante obtenerEstudianteByNombre(String nombre);
}
