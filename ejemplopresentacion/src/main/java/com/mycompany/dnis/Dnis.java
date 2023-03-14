/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dnis;

import java.util.Enumeration;
import java.util.Scanner;

/**
 * Clase principal del proyecto.
 * 
 * @author Gael
 * @version 8/03/2023
 */

public class Dnis {

    /**
     * Constructor de la clase.
     */
    public Dnis(){
        
    }
    
    /**
     * Función principal de la clase.
     * @param args Argumentos.
     */
    public static void main(String[] args) {
        int opc;
        String dni;
        String nombre;
        long tel;
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        Agenda agenda = new Agenda();
        Persona persona;
        
        do{
            System.out.println("\nMenu: \n1. Agregar persona.\n2. Buscar persona.\n3. Eliminar persona.\n4. Mostrar todas las personas.\n5. Salir.");
            opc = leer.nextInt();
            
            switch(opc){
                
                case 1:
                    
                    System.out.println("Ingrese el nombre de la persona: ");
                    nombre = leer.next();
                    System.out.println("Ingrese el DNI de la persona: ");
                    dni = leer2.next();
                    System.out.println("Ingrese el teléfono de la persona: ");
                    tel = leer.nextLong();
                    
                    if (agenda.agregar(nombre, dni, tel) == true){
                        
                        System.out.println("Se ha agregado a la persona correctamente");
                        
                    } else{
                        
                        System.out.println("La persona ya está registrada.");
                        
                    }
                    break;
                    
                
                case 2:
                    
                    System.out.println("\nIngrese el DNI a buscar: ");
                    dni = leer.next();
                    persona = agenda.recuperar(dni);
                    if(persona != null){
                        
                        System.out.println("\nPERSONA ENCONTRADA:\n");
                        System.out.println("Nombre: " + persona.getNombre());
                        System.out.println("DNI: " + persona.getDni());
                        System.out.println("Teléfono: " + persona.getTelefono());
                        
                    } else{
                        System.out.println("No se encontró a la persona con el DNI especificado.");
                    }
                    break;
                    
                case 3:
                    
                    System.out.println("\nIngrese el DNI de la persona a eliminar: ");
                    dni = leer.next();
                    
                    if(agenda.eliminar(dni)){
                        
                        System.out.println("\nPersona eliminada.");
                        
                    } else{
                        
                        System.out.println("No se ha encontrado a la persona.");
                        
                    }
                    break;
                    
                case 4:
                    
                    System.out.println("Mostrando todas las personas");
                    Enumeration<String> e = agenda.total();
                    System.out.println("----Lista de agenda----");
                    while(e.hasMoreElements()){
                        dni = e.nextElement();
                        persona = agenda.recuperar(dni);
                        
                        System.out.println("Nombre: " + persona.getNombre());
                        System.out.println("DNI: " + persona.getDni());
                        System.out.println("Teléfono: " + persona.getTelefono());
                        System.out.println("\n");
                    }
                    break;
                  
            } //switch
        } while(opc != 5);
        
        
    }// main
    
    /**
     *
     * @param nombre
     * @param dni
     * @param tel
     * @return
     */
    
} // class
