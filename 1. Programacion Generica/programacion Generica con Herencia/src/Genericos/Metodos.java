
package Genericos;

import Genericos.Generica;
import Persona.Jefe;
import Persona.Administrador;
import Persona.Persona;
import Persona.Persona;

public class Metodos<A,B,C extends A> {
 A Persona1;
 B Operario;
 C Administrativo;
    public Metodos(A datos1,B datos2,C datos3) {
         Persona1=datos1;
         Operario=datos2;
         Administrativo=datos3;
    }

    

    public void cacularSueldo1(Persona Obje){
        double salarioT;
        int contHE=0;
       double EHoras;
        int i;
        double SHoras=Obje.getHorasTra()*1.5;
        for (i=0;i<Obje.getHorasExtra();i++){
            if (i%2==0){
                contHE++;
            }
        }
        if (i==1){
            EHoras  = (double)contHE*1.5;
        }else{
             EHoras=(double)contHE*2;
        }
        salarioT= EHoras+SHoras;
        Obje.setSalario(salarioT);
        System.out.println("El salario de "+Obje+"Es-->"+salarioT);
    }
    
     public  void cacularSueldo2(Administrador Obje){
        double salarioT;
        int contHE=0;
       double EHoras;
        int i;
        double SHoras=Obje.getHorasTra()*2;
        for (i=0;i<Obje.getHorasExtra();i++){
                contHE++;
        }
         EHoras=(double)contHE*1.5;
        salarioT= EHoras+SHoras;
        Obje.setSalario(salarioT);
        System.out.println("El salario de "+Obje+"Es-->"+salarioT);
        
    }
     
    public void cacularSueldo3(Jefe Obje){
        double salarioT;
        int contHE=0;
       double EHoras;
        int i;
        double SHoras=Obje.getHorasTra()*1.5;
        for (i=0;i<Obje.getHorasExtra();i++){
            if (i%2==0){
                contHE++;
            }
       
        }
        if (i==1){
            EHoras  = (double)contHE*1.5;
        }else{
             EHoras=(double)contHE*2;
        }
        salarioT= EHoras+SHoras;
        Obje.setSalario(salarioT);
        System.out.println("El salario de "+Obje+"Es-->"+salarioT);
    }
    
    public void envio1(){
       llamar1Persona((Persona) Persona1);
       llamar1Persona((Persona) Operario);
      System.out.print("Este no salio profe :( --->  "); llamar1Persona((Persona) Administrativo);

    }
    
    public void envio2(){
       llamar2Persona( Persona1);
       llamar2Persona( Operario);
       llamar2Persona(Administrativo);
    }
    
    public void envio3(){
        try{
       llamar3Persona((Persona) Persona1);
       llamar3Persona((Persona) Operario);
       llamar3Persona((Persona) Administrativo);
          }catch(Exception ex){
               System.out.println("NO SE PUEDE CALCULAR EL SALARIO PARA ESTE TIPO DE OBJETO");
          }
    }
    
    public <O>void llamar1Persona(O Obj){
                try {
                    cacularSueldo1((Persona) Obj); 
                }catch(Exception ex){
                    System.out.println("NO SE PUEDE CALCULAR EL SALARIO PARA ESTE TIPO DE OBJETO");
                }
    }
    public <O>void llamar2Persona(O Obj){
                try {
                    cacularSueldo2((Administrador) Obj); 
                }catch(Exception ex){
                    System.out.println("NO SE PUEDE CALCULAR EL SALARIO PARA ESTE TIPO DE OBJETO");
                }
    }
       public <O>void llamar3Persona(O Obj){
                try {
                    cacularSueldo3((Jefe) Obj); 
                }catch(Exception ex){
                    System.out.println("NO SE PUEDE CALCULAR EL SALARIO PARA ESTE TIPO DE OBJETO");
                }
    }
   
    
}
