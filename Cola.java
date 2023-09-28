package proyecto2_floricela_arguedas;

public class Cola {

    //Declaraciones
    static TipoInstrumento[] cola = new TipoInstrumento[100];
    static int actual = -1;
    static int fin = -1;
    static int limite = cola.length;

    //METODOS   
    public static boolean LlenarCola(TipoInstrumento nuevoTipoInstrumento) {

        boolean bandera = false;
        if (fin + 1 != limite) {
            fin++;
            cola[fin] = nuevoTipoInstrumento;
            bandera = true;
        }
        return bandera;

    }

    public static void VaciarCola() {
        //Elimino el primer elemento de la cola.
        cola[0] = null;
        //Creo un ciclo que permita dezplazar los elementos de la cola al indice anterior
        int i = 0;
        while (i < fin) {
            cola[i] = cola[i + 1];
            cola[i + 1] = null;
            i++;
        }
        fin = i - 1;//Disminuyo el final de la cola.
    }

    public static boolean NoExistenInstrumentos() {
        return Cola.cola[0].pilaInstrumentos.Vacia();
    }

    public static TipoInstrumento Siguiente() {

        if (actual <= fin) {
            actual++;
            return Cola.cola[actual];
        } else {
            return null;
        }

    }

    public static void Resetear() {
        actual = -1;//Devuelvo la cola al inicio
    }

}
   
