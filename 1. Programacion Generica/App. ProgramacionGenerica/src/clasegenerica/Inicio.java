/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasegenerica;


/**
 *
 * @author aplaza
 */
public class Inicio 
{
    public static void main(String[] args) 
    {
        Generica <String> g=new Generica<String>();
        g.setDato("Ana");
        System.out.println (g.getDato());
        
        Persona p=new Persona("Juan");
        
        Generica <Persona>g1=new Generica<Persona>();
        g1.setDato(p);
        System.out.println (g1.getDato());
    }    
}
