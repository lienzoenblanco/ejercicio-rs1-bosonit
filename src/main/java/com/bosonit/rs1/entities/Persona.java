package com.bosonit.rs1.entities;

public class Persona {
    private int id;
    private String nombre;
    private int edad;
    private String poblacion;

    public Persona(String nombre, int edad, String poblacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.poblacion = poblacion;
    }
    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
}
