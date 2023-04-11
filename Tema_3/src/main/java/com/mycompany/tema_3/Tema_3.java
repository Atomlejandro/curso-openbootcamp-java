/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tema_3;

/**
 *
 * @author danny
 */
public class Tema_3{
    


    public static void main(String[] args) {
        int resultado;
      int  param1 = 10;
      int  param2 = 20;
      int  param3 = 30;
        resultado = suma(param1, param2, param3);
    
        System.out.println("El resultado de la suma es: " + resultado);
        
        
         Coche miCoche = new Coche();
        miCoche.maspuerta();
        
        System.out.println("Las puertas finales son: " + miCoche.puertas);
    }
    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}
    
	
    
    class Coche {
    	int puertas = 4;
    	
    	public void maspuerta() {
    		this.puertas++;
    	}
    	
    }
    
   

