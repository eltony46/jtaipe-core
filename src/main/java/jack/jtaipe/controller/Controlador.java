package jack.jtaipe.controller;

import jack.jtaipe.entity.Asignatura;
import jack.jtaipe.entity.Estudiante;
import jack.jtaipe.entity.Persona;
import jack.jtaipe.entity.Profesor;
import jack.jtaipe.service.IAsignaturaService;
import jack.jtaipe.service.IEstudianteService;
import jack.jtaipe.service.IPersonaService;
import jack.jtaipe.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("index")
public class Controlador {
    @Autowired
    private IPersonaService personaService;



    @GetMapping("/listaPersona")
    public List<Persona> listaPersona() {
        return this.personaService.listaPersonas();
    }

    @GetMapping("/buscarPersona")
    public Persona buscarPersona(@RequestParam("nombre") String nombre) {
        return this.personaService.obtenerPersonaBynombre(nombre);

    }

       @Autowired
       private IEstudianteService estudianteService;
        @GetMapping("/listaEstudiantes")
        public List<Estudiante>listaEstudiantes(){
            return this.estudianteService.listaEstudiantes();
        }
        @GetMapping("/buscarEstudiante")
        public Estudiante buscarEstudiante(@RequestParam("nombre") String nombre) {
            return this.estudianteService.obtenerEstudianteByNombre(nombre);
        }

    @Autowired
        private IProfesorService profesorService;
         @GetMapping("/listaProfesor")
         public List<Profesor>listaProfesor() {
             return this.profesorService.listaProfesor();
         }
         @Autowired
    private IAsignaturaService asignaturaService;
         @GetMapping("/listaCurso")
    public List<Asignatura>listaCurso(){
             return this.asignaturaService.curso();
         }
}


