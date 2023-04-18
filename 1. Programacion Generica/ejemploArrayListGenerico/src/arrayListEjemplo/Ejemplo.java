/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayListEjemplo;

import java.util.ArrayList;

/**
 *
 * @author aplaza
 */
public class Ejemplo 
{
    ArrayList <String> listado=new ArrayList();

    public void ingresarValores() //método
    {
        listado.add("hola");
        listado.add("3");
        listado.add("tarea");
        
        String valor=(String) listado.get(0);
        
        String dato=(String) listado.get(1);
        
        System.out.println (valor+"  "+dato);
    }    
}
