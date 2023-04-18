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
public class Datos <P,S>
{
    ArrayList<P> matA=new ArrayList<P>(); 
    ArrayList<P> matAc; 
    
    ArrayList<S> matB=new ArrayList<S>(); 
    ArrayList<S> matBc; 
            
    public ArrayList<P> ingresarInteger()
    {
        Valor<Integer> v;
        for(int f=0; f<3; f++)
        {
            matAc=new ArrayList<P>(); 
            
            for (int c=0; c<3; c++)
            {
                v=new Valor();
                int valorRandom= (int) (Math.random()*11);
                //System.out.println (valorRandom);
                v.setValor(valorRandom);
                
                matAc.add((P) v.getValor());
            }
            matA.add((P) matAc);
        }
        //System.out.println (matA);
        return matA;
    }
    
    public void ingresarCharacter()
    {
        
    }
}
