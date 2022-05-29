package com.bosonit.rs1.controllers;

import com.bosonit.rs1.entities.Persona;
import com.bosonit.rs1.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/persona")

public class DeleteUserControler {

    @Autowired
    private PersonaService personaService;

    @DeleteMapping("/{id}")
    public ResponseEntity deletePersona(@PathVariable String id){
        this.personaService.delete(Integer.parseInt(id));
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
