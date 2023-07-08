/*
Nombre: Carlos Estuardo Tomas Mejia
carnet: 2021215
codigo: tecnico IN5AV
fecha: creacion 27/03/2022
fecha: modificacion
 */
package org.carlostomas.system;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Principal {
    

    
    public static void main(String[] args) {
        
//        -----------------VECTORES-----------------------------
        
     Scanner r = new Scanner(System.in);
      int[] vector1 = new int[9];
      int[] vector2 = new int[9];
      int[] vector3 = new int[9];
      int[] vector4 = new int[9];
      
      for(int x=0; x<9; x++){
          System.out.println("Ingrese los valores del primer vector"+ x );
          vector1[x]= r.nextInt();
      }
      
      for(int x=0; x<9; x++){
          System.out.println("Ingrese los valores del segundo vector"+ x );
          vector2[x]= r.nextInt();
      }
      
      for(int x=0; x<9; x++){
          vector3[x] = vector1[x] + vector2[x];
      }
      
      for(int x=0; x<9; x++){
          System.out.println(vector1[x] + "  +  " + vector2[x] + " = " + vector3[x] );
      }
        
//  ---------------------------- RESTA   VECTORES  --------------------------

for(int x=0; x<9; x++){
          System.out.println("Ingrese los valores del primer vector"+ x );
          vector1[x]= r.nextInt();
      }
      
      for(int x=0; x<9; x++){
          System.out.println("Ingrese los valores del segundo vector"+ x );
          vector2[x]= r.nextInt();
      }
      
      for(int x=0; x<9; x++){
          vector4[x] = vector1[x] - vector2[x];
      }
      
      for(int x=0; x<9; x++){
          System.out.println(vector1[x] + "  -  " + vector2[x] + " = " + vector4[x] );
      }
      
      
      
      
//      -------------------------MATRIZES-----------------------------------

        int matriz_uno[][] = new int[3][3];
        int matriz_dos[][] = new int[3][3];
        int matriz_resultante[][] = new int[3][3];
        int matriz_resultante_resta[][] = new int[3][3];

        
        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_uno.length; j++) {
                matriz_uno[i][j] = (int) (Double.parseDouble(JOptionPane.showInputDialog(null, "valores de la primera matriz"))* 5);
            }
        }

        
        for (int i = 0; i < matriz_dos.length; i++) {
            for (int j = 0; j < matriz_dos.length; j++) {
                matriz_dos[i][j] = (int) (Double.parseDouble(JOptionPane.showInputDialog(null,"valores de la segunda matriz"))* 5);
            }
        }

        
        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_dos.length; j++) {
                matriz_resultante[i][j] = matriz_uno[i][j] + matriz_dos[i][j];
                
            }
        }

       
        
        for (int i = 0; i < matriz_uno.length; i++) {

            for (int j = 0; j < matriz_uno.length; j++) {
                System.out.print("[ " + matriz_uno[i][j] + " ]");
            }

            if (i == 1) {
                System.out.print("  +   ");
            } else {
                System.out.print("      ");
            }                        

            for (int j = 0; j < matriz_dos.length; j++) {
                System.out.print("[ " + matriz_dos[i][j] + " ]");
            }
            
            if (i == 1) {
                System.out.print("  =   ");
            } else {
                System.out.print("      ");
            }
            
            for (int j = 0; j < matriz_resultante.length; j++) {
                System.out.print("[ " + matriz_resultante[i][j] + " ]");
            }

            System.out.println("");
            }
        
        
//        ----------- RESTA----------------------------

        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_uno.length; j++) {
                matriz_uno[i][j] = (int) (Double.parseDouble(JOptionPane.showInputDialog(null, "valores de la primera matriz"))* 5);
            }
        }

        
        for (int i = 0; i < matriz_dos.length; i++) {
            for (int j = 0; j < matriz_dos.length; j++) {
                matriz_dos[i][j] = (int) (Double.parseDouble(JOptionPane.showInputDialog(null,"valores de la segunda matriz"))* 5);
            }
        }

        
        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_dos.length; j++) {
                 matriz_resultante[i][j] = matriz_uno[i][j] - matriz_dos[i][j];
            }
        }
        
        
        for (int i = 0; i < matriz_uno.length; i++) {

            for (int j = 0; j < matriz_uno.length; j++) {
                System.out.print("[ " + matriz_uno[i][j] + " ]");
            }

            if (i == 1) {
                System.out.print("  -   ");
            } else {
                System.out.print("      ");
            }                        

            for (int j = 0; j < matriz_dos.length; j++) {
                System.out.print("[ " + matriz_dos[i][j] + " ]");
            }
            
            if (i == 1) {
                System.out.print("  =   ");
            } else {
                System.out.print("      ");
            }
            
            for (int j = 0; j < matriz_resultante.length; j++) {
                System.out.print("[ " + matriz_resultante[i][j] + " ]");
            }

            System.out.println("");
        }

    }
 
}
