/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodogenerico;


/**
 *
 * @author aplaza
 */
public class Inicio 
{
    public static void main (String args[])
    {
        Ordenacion ord=new Ordenacion();
    
        String datos[]={"Juan","Ana","Pedro"};
        System.out.println (ord.ordenar(datos));
        
        for(String valor: datos)
        {
            System.out.println (valor);
        }
        
        
        //ArrayList<String> dato=new ArrayList();
    }
}
