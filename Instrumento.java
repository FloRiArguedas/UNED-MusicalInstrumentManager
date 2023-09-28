/*
 Clase Instrumento
 */
package proyecto2_floricela_arguedas;

/**
 *
 * @author  Flori
 */
public class Instrumento {
    
    String DNI;
    String nombre;
    String Condicion;
    double valor;

    public Instrumento(String DNI, String nombre, String Condicion, double valor) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.Condicion = Condicion;
        this.valor = valor;
    }

    
       
    
    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCondicion() {
        return Condicion;
    }

    public double getValor() {
        return valor;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCondicion(String Condicion) {
        this.Condicion = Condicion;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
    
}
