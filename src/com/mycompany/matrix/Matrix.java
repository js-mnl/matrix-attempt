/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.matrix;


import java.util.Scanner;
import static jdk.nashorn.internal.objects.Global.print;
import java.util.*;

/**
 *
 * @author José Manuel León
 */
public class Matrix {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    static void CompletarMatriz (int[][] M_1, int[][] M_2, int[][] M_3, int n)
    {
        System.out.println("Actividad °1: Completar 3 matrices; una vez realizado, sumar las 2 primeras y multiplicar el resultado por la tercera: ");
       for (int x=0; x < n; x++) {
            for (int y=0; y < n; y++) {	
                System.out.print("Valores en la primera matriz: ");
                M_1[x][y]=entrada.nextInt();
            }
       }
        for (int x=0; x < n; x++) {
            for (int y=0; y < n; y++) {	
                System.out.println("Valores en la segunda matriz: ");
                M_2[x][y]=entrada.nextInt();
            }
       }
       for (int x=0; x < n; x++) {
            for (int y=0; y < n; y++) {	
                System.out.println("Valores en la tercera matriz: ");
                M_3[x][y]=entrada.nextInt();
            }
       }
      System.out.println("Matrices completadas"); 
    
    
    }
    //#Ahora si, vamos con la actividad °1: sumar la matrices m1 y m2, y luego, multiplicar el resultado por la matriz m3
    static void SumaDeMatrices (int [][] M_1,int [][] M_2 ,int [][] M_3, int n)
    {
        int [][] M_suma = new int[n][n];
        int [][] M_RESULTADO = new int[n][n];
        for (int x=0; x < n; x++) {
            for (int y=0; y < n; y++) {				
                 M_suma[x][y]=M_1[x][y]+M_2[x][y];	// Se suman las dos primeras matrices (m1 y m2)
                 
                 System.out.print(M_suma[x][y]+" "); 
                 
                          }
            System.out.println();
        }
        System.out.print("Tras sumar las matrices m1 y m2, el resultado obtenido es: ");
        System.out.println();
        
        for (int x=0; x < n; x++) {
            int mul=0;
            for (int y=0; y < n; y++) {				
                 M_RESULTADO[x][y]=mul+M_suma[x][y]*M_3[x][y];	// Se multiplica el resultado de las dos primeras matrices (m1 y m2) por la tercera matriz (m3)
                 
                 System.out.print(M_RESULTADO[x][y]+" ");
                 
                          }
            System.out.println();
        }
        System.out.print("Tras multiplicar las matrices, el resultado obtenido es: ");
        
    }
    
    //#Actividad °3: Valide si una matriz es Identidad
    static void ValidacionDeMatriz(int [][] M_1,int n)
    { 
         boolean log = true;
         System.out.println("Actividad °3: Valide si una matriz es Identidad: ");
         for (int x=0; x < n; x++) {
            for (int y=0; y < n; y++) {	
                System.out.println("Valor: ");
                M_1[x][y]=entrada.nextInt();
            }
       }
         
          for (int x=0; x < n; x++) {
            for (int y=0; y < n; y++) {	
                
               if (x==y) {
                    if (M_1[x][y]==1){
                        System.out.println();
                        System.out.println("Validación en proceso");
                        
                    }
               }else{
                   if (M_1[x][y]!=0){
                       System.out.print("Esta matriz no es Identidad");
                       log = false;  // Esta variable es para que no envíe el mensaje de que una matriz es Identidad
                       // Al ver que no cumple los requisitos, arroja un mensaje pero no se sale del ciclo for (se encarga de recorrerlo en su totalidad) 
                   }
           
                   
               }           
            }
       }
          if (log==true){
           System.out.println();
           System.out.println("Es matriz es Identidad");
          }  
           
         
    }
    //Actividad °4: Valide si una matriz es Triangular Superior
    static void MatrizTriangular(int [][] M_1,int n)
    { 
         int log=0;
         System.out.println("Actividad °4: Valide si una matriz es Triangular Superior: ");
         for (int x=0; x < n; x++) {
            for (int y=0; y < n; y++) {	
                System.out.println("Valor : ");
                M_1[x][y]=entrada.nextInt();
            }
       }
         
          for (int x=0; x < n; x++) {
            for (int y=0; y < n; y++) {	
                
              if (x<y){
                  log+=M_1[x][y];  // Se suman los valores adentro de la matriz, y si cumplen los requisitos el valor deberia ser distinto a cero(0)
                                  // En caso de que sea devuelto un numero igual a cero (0), ya no seria triangular Superior
              } 
                       
              }
                       
            }
          if (log==0){   //Si tras cumplir la condicion queda en 0 la suma no es una matriz Triangular Superior
              System.out.println("No cumple con los requisitos para ser una matriz Triangular Superior");
          }else{
               System.out.println("Cumple con los requisitos para ser una matriz Triangular Superior");
          }
           
     
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
        int n,num = 5;
        System.out.print("Ahora, ingrese la dimension de la matriz en cuestion: ");
        n=entrada.nextInt();
        
        int [][] M_1 = new int[n][n];
        int [][] M_2 = new int[n][n];
        int [][] M_3 = new int[n][n];
        System.out.println("Este es un programa de matrices. Indique el numero de ejercicios a realizar: ");
        while (num!=0){
        System.out.println("Actividad °1 , pulse la tecla 1");
        System.out.println("Actividad °3 , pulse la tecla 3");
        System.out.println("Actividad °4 , pulse la tecla 4");
        System.out.println("Si desea salir, pulse la tecla 0");
        System.out.println("");
        num = entrada.nextInt();
        System.out.println("");
        
     switch (num) 
        {
            case 1:  num = 1;
                  CompletarMatriz(M_1,M_2,M_3,n);
                  SumaDeMatrices(M_1,M_2,M_3,n);
                     break;
            case 2:  num = 2;
                    RellenarDatos(M_1,n);
                     break;
            case 3:  num = 3;
                     ValidacionDeMatriz(M_1,n);
                     break;
            case 4:  num = 4;
                     MatrizTriangular(M_1,n);
                     break;
            case  0:  num = 0;
                     
                     break;
            
            default:System.out.println("Expresion invalida");
        }
        }
        //CompletarMatriz(M_1,M_2,M_3,n);
        //SumaDeMatrices(M_1,M_2,M_3,n);
        //RellenarDatos(M_1,n);
        //ValidacionDeMatriz(M_1,n);
        //MatrizTriangular(M_1,n);
        
        
        
         
    }
}
    private static void RellenarDatos(int[][] M_1, int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
