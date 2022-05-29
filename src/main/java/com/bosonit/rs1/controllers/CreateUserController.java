package com.bosonit.rs1.controllers;

import com.bosonit.rs1.entities.Persona;
import com.bosonit.rs1.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/persona")
public class CreateUserController {
    @Autowired
    private PersonaService personaService;

    @PostMapping()
    public ResponseEntity<Persona> addPersona(@RequestBody Persona nuevaPersona) {
        nuevaPersona = this.personaService.add(nuevaPersona);
        return new ResponseEntity<>(nuevaPersona, HttpStatus.CREATED);
    }

}
