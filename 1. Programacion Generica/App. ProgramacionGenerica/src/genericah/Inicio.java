/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericah;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aplaza
 */
public class Inicio 
{
    public static void main (String args[])
    {
        Cliente1 c1=new Cliente1("Ana");
        Cliente1 c2=new Cliente1("Pedro");
        
        List<Cliente1> lista=new ArrayList<>();
        lista.add(c1);
        lista.add(c2);
        
        listarUnBounded(lista);
    } 
        
    public static void listarUpperBounded(List<? extends Persona> lista)
    {
        for(Persona c: lista)
        {
            System.out.println (c.getNombre());
        }
    }       
    
    public static void listarLowerBounded(List<? super Cliente> lista)
    {
        for(Object c: lista)
        {
            System.out.println (((Persona)c).getNombre());
        }
    } 
    
    public static void listarUnBounded(List<?> lista)
    {
        for(Object c: lista)
        {
            if(c instanceof Cliente)
                System.out.println (((Cliente)c).getNombre());
            if(c instanceof Empleado)
                System.out.println (((Empleado)c).getNombre());
        }
        
    }
    
    /*public static void listar(List<Cliente1> lista)
    {
        for(Cliente1 c: lista)
        {
            System.out.println (c.getNombre());
        }
    }*/  
}
