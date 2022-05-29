package com.bosonit.rs1.controllers;

import com.bosonit.rs1.service.PersonaService;
import com.bosonit.rs1.entities.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/persona")
public class GetUserController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<Persona> getByName(
            @PathVariable String nombre
    ){
        Persona persona = this.personaService.getByName(nombre);
        if (persona == null){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Persona> getById(@PathVariable String id){
        Persona persona = this.personaService.getById(Integer.parseInt(id));
        if (persona == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(persona, HttpStatus.OK );
    }

    

}
