/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciageneric;

/**
 *
 * @author aplaza
 */
public class Inicio 
{
    public static void main (String args[])
    {
        Persona administrativo=new Persona(01,"Ana",45);
        
        Cliente jefe=new Cliente(02,"Pedro",35);
        
        Persona nuevoAdmin=jefe;
        
        
        Persona p=new Persona(01,"Ana",45);
        Generica <Persona> administrativos=new Generica<Persona>();
        administrativos.setDato(p);
        
        Generica <Cliente> jefes=new Generica<Cliente>();
        jefes.setDato(new Cliente(02,"Pedro",35));
        
        //Generica <Persona> nuevoAdmins=jefes;
        
        Generica.imprimir(administrativos);
        
        Generica.imprimir(jefes);
    }
}
