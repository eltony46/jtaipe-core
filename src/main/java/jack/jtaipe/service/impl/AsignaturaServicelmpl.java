package jack.jtaipe.service.impl;

import jack.jtaipe.dao.IAsignaturaDao;
import jack.jtaipe.entity.Asignatura;
import jack.jtaipe.service.IAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AsignaturaServicelmpl implements IAsignaturaService {

    @Autowired
    private IAsignaturaDao asignaturaDao;

    @Override
    public Asignatura getPersonaByAsignatura(String curso) {
        return this.asignaturaDao.findAsignaturaBycurso(curso);
    }

    @Override
    public List<Asignatura> curso() {
        return null;
    }

    @Override
    public List<Asignatura> curso(String asignatura) {
        return null;
    }


}
