package jack.jtaipe.service;

import jack.jtaipe.entity.Persona;

import java.util.List;

public interface IPersonaService {
    //Listar personas
    List<Persona> listaPersonas();

    //Buscar persona por su nombre
    Persona obtenerPersonaBynombre(String nombre);
}
