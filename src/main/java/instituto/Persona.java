
package instituto;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;
/**
 * Clase para crear un objeto de tipo persona.
 * 
 * @author Víctor Merino
 * @version 1.0.0
 */
public class Persona implements Comparable<Persona> {

    private Nif nif;
    private String nombre;
    private char genero;
    private LocalDate nacimiento;
    
    /**
     * Constructor de la clase persona.
     * Crea un objeto de tipo persona.
     */
    public Persona() {
        nif = new Nif();
        nombre = "";
        genero = ' ';
        nacimiento = LocalDate.of(1990, 1, 1);
    }
    
    /**
     * Constructor de la clase persona.
     * Recibe como parámetro un numero entero.
     * Crea un nif a partir de los numeros recibidos.
     * @param nif numero entero.
     */
    public Persona(int nif) {
        this();
        this.nif = new Nif(nif);
    }
    
    /**
     * Constructor de la clase persona.
     * Recibe como parámetro un numero entero, un nombre, el género en forma de char,
     * y numeros enteros para usarlos como dia, mes y año.
     * 
     * @param nif número entero.
     * @param nombre String.
     * @param genero char.
     * @param dia número entero.
     * @param mes número entero.
     * @param ano número entero.
     */
    public Persona(int nif, String nombre, char genero,
            int dia, int mes, int ano) {
        this.nif = new Nif(nif);
        this.nombre = nombre;
        this.genero = genero;
        this.nacimiento
                = LocalDate.of(ano, mes, dia);
    }
    
    /**
     * Getter del nif.
     * Devuelve un objeto de tipo nif de la persona.
     * @return 
     */
    public Nif getNif() {
        return nif;
    }
    /**
     * Setter del nif.
     * Recibe un objeto de tipo nif y lo establece a la persona.
     * @param nif Recibe un objeto de tipo nif.
     */
    public void setNif(Nif nif) {
        this.nif = nif;
    }
    /**
     * Getter del nombre.
     * @return String con el nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Setter del nombre.
     * Establece el nombre a la persona.
     * @param nombre String con el nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Getter de género.
     * 
     * @return char correspondiente al género de la persona.
     */
    public char getGenero() {
        return genero;
    }
    /**
     * Setter del género.
     * Establece el género de la persona
     * @param genero char correspondiente al género de la persona.
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }
    /**
     * Getter de la fecha de nacimiento.
     *
     * @return Devuelve la fecha de nacimiento de la persona.
     */
    public LocalDate getNacimiento() {
        return nacimiento;
    }
    
    /**
     * Setter de la fecha de nacimiento.
     * 
     * Se establece la fecha de nacimineto a la persona.
     * @param nacimiento Recibe como parametro una fecha en formato localDate.
     */
    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }
    /**
     * Método para recibir la edad de la persona.
     * Revisa el periodo transcurrido entre la fecha de nacimineto y la fecha local.
     * 
     * @return Devuelve un número entero con los años de la persona.
     */
    public int getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        if (nombre.split(" ").length > 1) {
            return nif + "\t" + nombre.split(" ")[0]
                    + '\t' + nombre.split(" ")[1] + "\t\t" + getEdad();
        } else {
            return nif + "\t" + nombre + "\t\t\t" + getEdad();
        }
    }
    /**
     * Método que compara dos personas por el nif.
     * Si la persona no está inicializada devuelve false.
     * Si los nifs de ambas personas coinciden se devuelve true.
     * 
     * @param a Recibe un objeto de tipo persona.
     * @return True o false según si el nif coincide o no.
     */
    public boolean equals(Persona a) {
        if (a == null) {
            return false;
        }
        return a.nif.toString().equals(this.nif.toString());
    }
    /**
     * Método equals.
     * Compara dos objetos refiriendose al nif de la persona.
     * @param obj objeto
     * @return true o false según si coincide el nif o no.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;

        return Objects.equals(this.nif, other.nif);
    }
    /**
     * Método compareTo.
     * Compara dos personas según el nif.
     * @param o recibe un objeto de tipo persona.
     * @return Devuelve las personas ordenadas según el nif.
     */
    @Override
    public int compareTo(Persona o) {
        return this.nif.toString().compareTo(o.nif.toString());
    }

}
