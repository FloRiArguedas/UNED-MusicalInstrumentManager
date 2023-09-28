
package proyecto2_floricela_arguedas;


public class Pila {

    //Declaraciones
    Instrumento[] pila = new Instrumento[100];
    int fin = -1;
    int tamano = this.pila.length;
    int actual = fin;

    public Pila() {
    }

    //METODOS
    public boolean Vacia() {
        if (this.fin == -1) {
            return true;
        }
        return false;
    }

    public boolean LlenarPila(Instrumento nuevoinstrumento) {
        boolean bandera = false;
        //Hago condicion para asegurarme que hay espacio en la pila.
        if (this.fin + 1 < tamano) {
            this.fin++;
            this.pila[fin] = nuevoinstrumento;
            bandera = true;
        }

        return bandera;
    }

    public boolean VaciarPila() {
        boolean banderaV = false;
        if (this.fin != -1) {
            this.pila[this.fin] = null;

            this.fin--;
            banderaV = true;
        }
        return banderaV;
    }

    public Instrumento Siguiente() {

        if (actual >= 0) {
            Instrumento ins = this.pila[actual];
            actual--;
            return ins;
        } else {
            return null;
        }

    }

    public void Resetear() {
        actual = fin;
    }

}
