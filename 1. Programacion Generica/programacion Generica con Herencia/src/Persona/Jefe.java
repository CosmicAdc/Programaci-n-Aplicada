
package Persona;

public class Jefe {
      String nombre,cedula;
        int horasTra,horasExtra;
        double salario;

    public Jefe(String nombre, String cedula, int horasTra, int horasExtra, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.horasTra = horasTra;
        this.horasExtra = horasExtra;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getHorasTra() {
        return horasTra;
    }

    public void setHorasTra(int horasTra) {
        this.horasTra = horasTra;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Jefe{" + "nombre=" + nombre + ", cedula=" + cedula + ", horasTra=" + horasTra + ", horasExtra=" + horasExtra +'}';
    }
        
        
}
