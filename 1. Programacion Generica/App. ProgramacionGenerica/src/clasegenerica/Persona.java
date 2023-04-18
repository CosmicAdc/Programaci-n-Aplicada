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
public class Persona 
{
    String nombre;
    
    public Persona(String nombre)
    {
        this.nombre=nombre;
    }
    
    @Override
    public String toString()
    {
        return nombre;
    }
}
