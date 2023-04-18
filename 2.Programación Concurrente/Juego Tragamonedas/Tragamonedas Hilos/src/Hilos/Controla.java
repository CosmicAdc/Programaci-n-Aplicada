
package Hilos;

import Pantalla.Pantalla_principal;
import javax.swing.JOptionPane;

public class Controla extends Thread{
  int ver [][];
  
  int c,tiempo;
  MATRIZ setter=new MATRIZ();

   public Controla(MATRIZ mat) {
         ver=mat.getMatriz();
   }
 public Controla(MATRIZ mat,int c,int tiempo) {
         ver=mat.getMatriz();
         this.c=c;
         this.tiempo=tiempo;
    }

 @Override
       public void   run(){
           System.out.println("----------empieza------------");
          while(Thread.currentThread().isInterrupted()==false)
        {
            try{
            Thread.sleep(tiempo);
            }catch(Exception ex){
                System.out.println("Ex " + ex);
                System.out.println("Termino"+Thread.currentThread().getName());
                Thread.currentThread().interrupt();
            }          
            Cambia(c);
            Pantalla_principal.cambiamos(c,ver);
        }

              System.out.println("Termino"+Thread.currentThread().getName());
              Metodo();
       }
    
    

public void Metodo(){

 for (int x=0; x < ver.length; x++) {
  for (int y=0; y < ver[x].length; y++) {
    System.out.print (ver[x][y]);
    System.out.print("--");
  }
     System.out.println("   ");
} 

}
 public void Cambia(int c){
    
     int aux=ver[3][c];
     ver[3][c]= ver[2][c];
     ver [2][c]= ver [1][c];
     ver[1][c]= ver [0][c];
     ver[0][c]=aux;
     setter.setMatriz(ver);
     
 }
 public void verifica(){
     
     System.out.println("m1"+ver[1][0]);
     System.out.println("m2"+ver[1][1]);
     System.out.println("m3" +ver[1][2]);
     if (ver[1][0] == ver[1][1]){
         if (ver[1][1] == ver [1][2]){
             JOptionPane.showMessageDialog(null, "FELICIDADES USTED A GANADO  :) ");
         }else{
        JOptionPane.showMessageDialog(null, "LASTIMA, VUELVA A INTENTAR  :(");
     }
     }else{
        JOptionPane.showMessageDialog(null, "LASTIMA, VUELVA A INTENTAR  :(");
     }
 }
 public int[][] verifica2(){
     return setter.getMatriz();
 }
 
 

}
