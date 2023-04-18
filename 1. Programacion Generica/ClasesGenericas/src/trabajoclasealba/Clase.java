
package trabajoclasealba;
public class Clase <T> {
      public T dato;

    public Clase() {
       dato = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

}
