/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

import java.util.TreeSet;

/**
 *
 * @author Víctor Merino
 */
public class Curso {
    
    private String nombre;
    private TreeSet<Persona> listaAlumnos;
    
    /**
     * Método que devuelve el nombre del curso.
     * @return 
     */
    protected String getNombre() {
        return nombre;
    }

    /**
     *Constructor de curso.
     * Recibe como parámetro un String con el nombre del curso.
     * Creaa un listado de alumnos.
     * @param nombre
     */
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }
    /**
     * Pasa a String un listado de alumnos.
     * Devuelve un String
     * @return 
     */
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }
    /**
     * Método para añadir alumnos.
     * Recibe como parámetro una persona y la añade a
     * la lista de alumnos.
     * @param p 
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}
