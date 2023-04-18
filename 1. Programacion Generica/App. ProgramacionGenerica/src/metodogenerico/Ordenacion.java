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
public class Ordenacion 
{
    public <T extends Comparable> T[] ordenar (T[] a)
    {
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i].compareTo(a[j])>0)
                {
                    T aux= a[i];
                    a[i]=a[j];
                    a[j]=aux;
                }
            }
        }
        return a;
    }        
} 
