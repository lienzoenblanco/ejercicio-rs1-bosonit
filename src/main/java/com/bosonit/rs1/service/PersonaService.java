package com.bosonit.rs1.service;

import com.bosonit.rs1.entities.Persona;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

import static java.util.Objects.isNull;

@Service
public class PersonaService {
    private ArrayList<Persona> personas;
    private int lastId = 1;

    public PersonaService() {
        this.personas = new ArrayList<Persona>();
    }
    public Persona add(Persona nuevaPersona) {
        nuevaPersona.setId(this.lastId++);
        this.personas.add(nuevaPersona);
        return nuevaPersona;
    }

    public Persona getById(int id){
        for (Persona persona : this.personas) {
            if (persona.getId() == id) {
                return persona;
            }
        }
        return null;
    }

    public Persona getByName(String nombre){
        for (Persona persona : this.personas) {
            if (Objects.equals(persona.getNombre(), nombre)) {
                return persona;
            }
        }
        return null;
    }

    public Persona update(int id, Persona payload){
        Persona findPersona = this.getById(id);
        if (findPersona == null){
            return findPersona;
        }

        if (payload.getNombre() != null){
            findPersona.setNombre(payload.getNombre());
        }
        if (!isNull(payload.getEdad())){
            findPersona.setEdad(payload.getEdad());
        }
        if (payload.getPoblacion() != null){
            findPersona.setPoblacion(payload.getPoblacion());
        }
        return findPersona;
    }

    public void delete(int id){
        Persona findPersona = this.getById(id);
        if (findPersona != null) {
            this.personas.remove(findPersona);
        }
    }
}
