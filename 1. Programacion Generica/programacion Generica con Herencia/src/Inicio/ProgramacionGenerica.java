
package Inicio;
import Persona.Persona;
import Genericos.Generica;
import Genericos.Metodos;
import Persona.Administrador;
import Persona.Jefe;
import Persona.Operario;
import java.util.ArrayList;
import java.util.List;

public class ProgramacionGenerica {

    public static void main(String[] args) {
        System.out.println("INICIO");
        Persona Per1= new Persona("Paula", "0302448642",9,13,0);
        Operario Ope1= new Operario("Oscar", "0150288959",14,26,0);
        Jefe Jefe1= new Jefe("Juan", "0107300469",13,32,0);
        Administrador Admin1= new Administrador("Armando","0150212793",21,13,0);

        Metodos<Persona,Operario,Administrador> Op1 = new Metodos<Persona,Operario,Administrador>(Per1,Ope1,Admin1);
        System.out.println("-----------------------------");
        Op1.envio1();
        Op1.llamar1Persona(Jefe1);
        System.out.println("-----------------------------");
        Op1.envio2();
        Op1.llamar2Persona(Jefe1);
        System.out.println("------------------------------");
        Op1.envio3();
        Op1.llamar3Persona(Jefe1);
    }
    
}
