
package trabajoclase;
import  java.util.Scanner;
public class Inicio {
   
    
    public static void main(String[] args) {
        System.out.println("0.INTEGER");
        System.out.println("1.CHAR");
        System.out.println("2.STRING");
         Scanner leer = new Scanner(System.in);
        int a,b,c;
        do{
               System.out.println("Ingrese su opcion 1");
               a= leer.nextInt();
        }while(a<0 || a>2);
     do{
               System.out.println("Ingrese su opcion 2");
               b= leer.nextInt();
        }while(b<0 || b>2);
    
     do{
               System.out.println("Ingrese el tamaño de su arreglo");
               c= leer.nextInt();
        }while(c<=0);
  
       Datos <Integer, Integer,Integer> d= new Datos();    
       d.setDato1(a);
       d.setDato2(b);
       d.setMatriz(c);
       d.crear(d.getDato1(),d.getDato2(),d.getMatriz());
    
     
       
   }   
}
