/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dnis;

/**
 * Clase para crear objetos Persona con los datos de las personas para el registro
 * 
 * @author Gael
 * @version 8/03/2023
 */

public class Persona {
    
    /** Nombre de la persona.*/
    private String nombre;
    
    /** DNI de la persona.*/
    private String dni;
    
    /** Número de teléfono de la persona.*/
    private long telefono;
    
    /**
     * Constructor de la clase
     * 
     * @param nom Nombre de la persona.
     * @param dni DNI de la persona.
     * @param tel Número de teléfono de la persona.
     * 
     */
    public Persona(String nom, String dni, long tel){
        
        this.nombre = nom;
        this.dni = dni;
        this.telefono = tel;
 
    }

    /**
     * Obtiene el nombre de la persona
     * @return String nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el DNI de la persona.
     * @return String DNI de la persona
     */
    public String getDni() {
        return dni;
    }

    /**
     * Obtiene el número de teléfono de la persona.
     * @return long número de teléfono de la persona.
     */
    public long getTelefono() {
        return telefono;
    }
        
}
