package com.bosonit.rs1.controllers;

import com.bosonit.rs1.entities.Persona;
import com.bosonit.rs1.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/persona")
public class UpdateUserController {

    @Autowired
    private PersonaService personaService;

    @PutMapping("/{id}")
    public ResponseEntity<Persona> update(
            @PathVariable String id,
            @RequestBody Persona payload
    ){
        Persona persona = this.personaService.update(Integer.parseInt(id), payload);
        if (persona == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }
}
