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
public class Generica <T>
{
    private T dato;
    
    public Generica()
    {
        dato=null;
    }
    
    public void setDato(T valor)
    {
        dato=valor;
    }
    
    public T getDato()
    {
        return dato;
    }
}
