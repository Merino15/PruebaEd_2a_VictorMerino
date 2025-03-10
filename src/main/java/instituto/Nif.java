
package instituto;

/**
 * Clase para crear un objeto de tipo Nif.
 * 
 * @author Víctor Merino
 * @version 1.0.0
 */
public class Nif {

    private int numero;
    private char letra;

    //CONSTANTE: no accesible - compartido por todo - no modificable
    private static final char[] LETRAS
            = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                'C', 'K', 'E'};
    
    /**
     * Método privado que asigna una letra para el NIF.
     * Recibe cómo parámetro un número entero.
     * Devuelve la letra que le corresponde al número.
     * @param numero
     * @return 
     */
    private static char calcularLetra(int numero) {
        return LETRAS[numero % 23];
    }
    
    /**
     * Constructor de la clase NIF.
     * No recibe ningún parámetro.
     */
    protected Nif() {
        this.numero = 0;
        this.letra = ' ';
    }

    /**
     * Constructor de la clase NIF.
     * Recibe cómo parametro un número entero.
     * Para asignar la letra se llama a la función calcularLetra.
     * @param numero
     */
    protected Nif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }
    
    /**
     * Sobreescribe la clase toString.
     * Devuelve un String con el conjunto del número del NIF y la letra.
     * @return 
     */
    @Override
    public String toString() {
        return numero + "-" + letra;
    }
    
    /**
     * Método protegido para establecer el NIF.
     * Recibe cómo parametro un número entero.
     * Para asignar la letra se llama a la función calcularLetra.
     * @param numero 
     */
    protected void setNif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }
    
    /**
     * Método equals que compara dos NIF.
     * Permite ver si dos NIF son iguales.
     * 
     * @param obj
     * @return 
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
        final Nif other = (Nif) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.letra == other.letra;
    }
}
