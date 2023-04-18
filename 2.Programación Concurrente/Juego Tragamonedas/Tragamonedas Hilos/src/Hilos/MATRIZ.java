/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

public class MATRIZ {
   int [][] matriz = {{0,0,0},{1,1,1},{2,2,2},{3,3,3}};

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    @Override
    public String toString() {
        return "MATRIZ{" + "matriz=" + matriz + '}';
    }
   
   
   
   
}
