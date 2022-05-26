package jack.jtaipe.service.impl;

import jack.jtaipe.dao.IEstudianteDao;
import jack.jtaipe.entity.Estudiante;
import jack.jtaipe.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudianteServicelmpl  implements IEstudianteService {

    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    public List<Estudiante> listaEstudiantes() {

        List<Estudiante> EstudianteList = this.estudianteDao.findAll();

        for(Estudiante Estudiante:EstudianteList) {
            System.out.println(Estudiante.toString());
        }

        return EstudianteList;
    }

    @Override
    public Estudiante obtenerEstudianteByNombre(String nombre) {
        return this.estudianteDao.buscarEstudiante(nombre);
    }

}
