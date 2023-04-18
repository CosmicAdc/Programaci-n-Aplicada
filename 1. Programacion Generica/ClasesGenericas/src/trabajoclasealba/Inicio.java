
package trabajoclasealba;

public class Inicio {

    public static void main(String[] args) {
       Clase <Persona> cp= new Clase();
       Clase <Estudiante> cE= new Clase();
       Persona  p1= new Persona("Andres","Alba");
       Estudiante p2= new Estudiante("Danny",20);
       cp.setDato(p1);
        System.out.println(cp.getDato());
        System.out.println("-----------------");
        cE.setDato(p2);
        System.out.println(cE.getDato());
        
    }
    
}
