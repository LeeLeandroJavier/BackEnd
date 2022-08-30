package com.portfolio.llj.Interface;

import com.portfolio.llj.Entity.Persona;
import java.util.List;

public interface IPersonaService{
    //traer lista de personas
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //eliminar un obj buscado por id
    public void deletePersona(Long id);
    
    //Buscar una persona por id
    public Persona findPersona(Long id);
    
    
}
