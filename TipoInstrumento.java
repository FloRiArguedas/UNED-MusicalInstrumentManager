package proyecto2_floricela_arguedas;

/*
 Clase Tipo Instrumento
 */
/**
 *
 * @author Flori
 */
public class TipoInstrumento {

    int ID_instrumento;
    String Descripcion;
    Pila pilaInstrumentos;

    public TipoInstrumento(int ID_instrumento, String Descripcion) {
        this.ID_instrumento = ID_instrumento;
        this.Descripcion = Descripcion;
        this.pilaInstrumentos = new Pila();
    }

    public int getID_instrumento() {
        return ID_instrumento;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setID_instrumento(int ID_instrumento) {
        this.ID_instrumento = ID_instrumento;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

}
