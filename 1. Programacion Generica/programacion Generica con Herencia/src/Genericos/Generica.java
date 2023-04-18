
package Genericos;
public class Generica <T>{
      T dato;

    public Generica() {
        dato = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Generica{" + "dato=" + dato + '}';
    }

}
