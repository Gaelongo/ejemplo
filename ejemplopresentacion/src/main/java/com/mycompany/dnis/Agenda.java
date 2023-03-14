/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dnis;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Esta clase define objetos Agenda que permiten crear 
 * y administrar un registro de persinas.
 *
 * @author Gael
 * @version 8/03/2023
 */
public class Agenda {
    
    /** Registro de personas */
    private Hashtable<String, Persona> tb = new Hashtable<String, Persona>();
    
    /**
     * Constructor de la clase.
     */
    public Agenda(){
        
    }
 
    /** Agrega una persona al registro.
     *  @param nom Nombre de la persona.
     *  @param dni DNI de la persona.
     *  @param tel Número de teléfono de la persona.
     *  @return boolean Si fue posible agregar a la persona.
     */
    public boolean agregar(String nom, String dni, long tel){
        
        if(!tb.containsKey(dni)){
            
            Persona persona = new Persona(nom, dni, tel);
            
            tb.put(dni, persona);
            
            return true;
            
        } else{
            
            return false;
        }
    }
    
    /**
     * Busca a la persona con el DNI especificado en el registro.
     * @param dni El DNI de la persona a buscar
     * @return Persona El objeto Persona en caso de haberla encontrado en el registro.
     */
    public Persona recuperar(String dni){
        
        if(tb.containsKey(dni)){
            
            return tb.get(dni);
            
        } else{
            
            return null;
            
        }
    }
    
    /**
     * Elimina a la persona con el DNI especificado del registro.
     * @param dni DNI de la persona a eliminar.
     * @return boolean si la persona fue encontrada y eliminada.
     */
    public boolean eliminar(String dni){
        
        if(tb.containsKey(dni)){
            
            tb.remove(dni);
            return true;
            
        }else{
            
            return false;
            
        }
    }
    
    /**
     * Enumera todos los DNI del registro
     * @return Enumeration Enumeración de todos los DNI del registro.
     */
    public Enumeration<String> total(){
        return tb.keys();
    }
   
}
