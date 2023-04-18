
package trabajoclase;

import java.util.ArrayList;
import java.util.Random;

public class Datos < T,M,G> {
public T dato1;
public M dato2;
public G matriz;
    public Datos() {
        this.dato1 = null;
        this.dato2 = null;
    }

    public T getDato1() {
        return dato1;
    }

    public void setDato1(T dato1) {
        this.dato1 = dato1;
    }

    public M getDato2() {
        return dato2;
    }

    public void setDato2(M dato2) {
        this.dato2 = dato2;
    }

    public G getMatriz() {
        return matriz;
    }

    public void setMatriz(G matriz) {
        this.matriz = matriz;
    }
    
    public void  crear(Integer a, Integer b,Integer c){    
        
        System.out.println("---MATRIZ 1---");
       Random r = new Random();
       if (a==0){
    Integer Matriz1 [][]=new Integer[c][c]; 
   for (int x=0; x < Matriz1.length; x++) {
    for (int y=0; y < Matriz1[x].length; y++) {
        Integer num= r.nextInt(10);
        Matriz1[x][y] = num;

  }  
}
     for (int x=0; x < Matriz1.length; x++) {
             for (int y=0; y < Matriz1[x].length; y++) {
                   System.out.print("|");
                   System.out.print (Matriz1[x][y]);
                   System.out.print("|");
            }
            System.out.println(" ");
         
     }
        envioI(Matriz1,c);
       }else if(a==1){
        Character Matriz1 [][]=new Character[c][c]; 
   for (int x=0; x < Matriz1.length; x++) {
    for (int y=0; y < Matriz1[x].length; y++) {
         char num=(char) (r.nextInt(5)+'a');
        Matriz1[x][y] = num;
  }  
}
     for (int x=0; x < Matriz1.length; x++) {
             for (int y=0; y < Matriz1[x].length; y++) {
                   System.out.print("|");
                   System.out.print (Matriz1[x][y]);
                   System.out.print("|");
            }
            System.out.println(" ");
     }
          envioC(Matriz1,c);
         
    }else{
         String Matriz1 [][]=new String[c][c];
          for (int x=0; x < Matriz1.length; x++) {
    for (int y=0; y < Matriz1[x].length; y++) {
         char s1=(char) (r.nextInt(5)+'a');
        char s2=(char) (r.nextInt(5)+'a');   
   
        String num=" " +s1+s2;
        Matriz1[x][y] = num;
  }  
}
     for (int x=0; x < Matriz1.length; x++) {
             for (int y=0; y < Matriz1[x].length; y++) {
                   System.out.print("|");
                   System.out.print (Matriz1[x][y]);
                   System.out.print("|");
            }
            System.out.println(" ");
     }      
         envioS(Matriz1,c);

    }
       
       
      System.out.println("---MATRIZ 2---");
       
      if (b==0){
         Integer Matriz2 [][]=new Integer[c][c];

   for (int x=0; x < Matriz2.length; x++) {
    for (int y=0; y < Matriz2[x].length; y++) {
        Integer num= (int)(Math.random()*10+1);
        Matriz2[x][y] = num;
  }  
}
     for (int x=0; x < Matriz2.length; x++) {
             for (int y=0; y < Matriz2[x].length; y++) {
                   System.out.print("|");
                   System.out.print (Matriz2[x][y]);
                   System.out.print("|");
            }
            System.out.println(" ");
     }
         envioI(Matriz2,c);
       }else if(b==1){
          Character Matriz2 [][]=new Character[c][c]; 
           for (int x=0; x < Matriz2.length; x++) {
    for (int y=0; y < Matriz2[x].length; y++) {
            char num=(char) (r.nextInt(5)+'a');
            Matriz2[x][y] = num;
  }  
}
     for (int x=0; x < Matriz2.length; x++) {
             for (int y=0; y < Matriz2[x].length; y++) {
                   System.out.print("|");
                   System.out.print (Matriz2[x][y]);
                   System.out.print("|");
            }
            System.out.println(" ");
     }
         
          
          
               envioC(Matriz2,c);
          
          
    }else{
          String Matriz2 [][]=new String[c][c]; 

          for (int x=0; x < Matriz2.length; x++) {
    for (int y=0; y < Matriz2[x].length; y++) {
         char s1=(char) (r.nextInt(5)+'a');
        char s2=(char) (r.nextInt(5)+'a');
        String num= " "+s1+s2;
        Matriz2[x][y] = num;
  }  
}
     for (int x=0; x < Matriz2.length; x++) {
             for (int y=0; y < Matriz2[x].length; y++) {
                   System.out.print("|");
                   System.out.print (Matriz2[x][y]);
                   System.out.print("|");
            }
            System.out.println(" ");
     }
              envioS(Matriz2,c);
    }


         

    
    
    
   
       
    }
    public void envioI(Integer mat[][],int c){
         Proceso pr = new Proceso();
         pr.agrupo(mat,c);
    }
      public void envioS(String mat[][],int c){
       Proceso pr = new Proceso();
         pr.agrupo(mat,c);
    }
      public void envioC(Character mat[][],int c){
       Proceso pr = new Proceso();
         pr.agrupo(mat,c);
    }
}

