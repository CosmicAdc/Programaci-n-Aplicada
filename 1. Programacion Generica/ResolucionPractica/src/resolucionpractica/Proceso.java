/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucionpractica;

import java.util.ArrayList;

/**
 *
 * @author aplaza
 */
public class Proceso 
{
   public <P> void agrupar(ArrayList<P> matA)
   {
       ArrayList<P> matX=new ArrayList<P>(); 
       ArrayList<P> matXc; 
       
       int i=0, p=0;
       
       while(i<11)
       {
            matXc=new ArrayList();
            for(P celda: matA)
            {
                for(Object dato: (ArrayList) celda)
                {
                    //System.out.println (dato);
                    if(i==Integer.parseInt(dato+""))
                    {
                        p=1;
                        matXc.add((P) dato);
                    }
                }
            }
            i++;
            if (p==1)
                matX.add((P) matXc);
            p=0;
       }
       
       System.out.println (matX);
   }
}
