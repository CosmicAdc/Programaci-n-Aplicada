
package trabajoclasealba;

public class Estudiante <k> {
public String Nombre;
public int  Edad;

    public Estudiante(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "Nombre=" + Nombre + ", Edad=" + Edad + '}';
    }
    

    
}
