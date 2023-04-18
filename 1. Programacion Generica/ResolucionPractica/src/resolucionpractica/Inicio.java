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
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Datos<Integer, Character> d=new Datos();
        ArrayList<Integer> matA=d.ingresarInteger();
        
        System.out.println (matA);
        
        Proceso p=new Proceso();
        p.agrupar(matA);
    }
    
}
