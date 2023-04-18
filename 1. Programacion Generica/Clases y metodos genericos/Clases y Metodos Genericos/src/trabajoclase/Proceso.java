
package trabajoclase;

import java.util.ArrayList;
import java.lang.Exception;
public class Proceso extends Exception {
    
    public <O> void agrupo(O[][] matriz, int c) {
                 System.out.println("------------------------------------");
                 System.out.println("DATOS AGRUPADOS");
                ArrayList<O> matriz1= new ArrayList<O>();
                ArrayList<O> matriz2;
                ArrayList <O> usadas= new ArrayList<O>();
                boolean NO=false;
               boolean existe=false;
                int cont=0;
                int e=0;
                int d=0;
                 O puntero= matriz[d][e];
                int i=0;
                while (i<(matriz.length*matriz.length)){
                    existe=false;
                     matriz2= new ArrayList();
                    for (int a=0; a<matriz.length;a++){ 
                   
                        for (int b=0; b<matriz.length;b++){ 
                                 if (matriz[a][b].equals(puntero)){  
                                NO=buscar(puntero,usadas);    
                     
                                if (NO==false){
                                matriz2.add(puntero);
                                usadas.add(puntero);
                              }else{
                                        matriz2.add(puntero);      
                                     
                                      }
                               }
                    }              
                    }

                  
                    if (matriz1.size()==0){
                             matriz1.add ((O)matriz2);   
                    }else{
                         if (matriz2.size()!=0){
                        for (int inic =0; inic<matriz1.size();inic++){
                             if (matriz2.equals(matriz1.get(inic))){
                             existe=true;
                        }
                          }
                        if (existe==false){                            
                                   matriz1.add ((O)matriz2);   
                        }
                        
                           }
                        }
                
//                     }else{
//                          boolean EXISTE=buscar((O)matriz2.get(0), usadas);
//                          System.out.println("EXISTE :"+EXISTE);
//                          if (EXISTE==true){                           
//                         }else{
//                             matriz1.add ((O)matriz2);         
//                         }
                    

                        if (e<c-1)
                            e++;
                        else{
                            d++;
                            e=0;
                        }

                   try{
                            puntero=matriz[d][e];
                   }catch(Exception ex){
                          
                   }
              
                              i++;

              
                
                 }            
                 int a= 0;
               for (O p: matriz1){
                    a++;
                    System.out.println(a+"."+p);
                }      
       System.out.println("--------------------------------------------------------------------------------------------");
    }
    public <O> boolean buscar(O mat, ArrayList<O> usadas){
        for (int i=0; i<usadas.size();i++){
            O b=usadas.get(i);
             for (O p:usadas){
                        if (mat.equals(b)){
                            return true;
                        }
                    }
                   
        }
                   return false;
   }
    
      
}

