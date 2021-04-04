/*
Crear la clase Lavarropas con los atributos marca, modelo y kilos de lavado, elegir el tipo de dato adecuado para ellos. Además se debe crear el método TipodeRopa e imprimir el tipo seleccionado:
Tipos de Ropa:
1_Lana
2_Ropa Sucia
3_Economico
4_Ropa de Bebe
*/

package Lavarropas;

import java.util.Scanner;

public class Inicio {
   public static void main(String[] arg){
        Scanner programa = new Scanner(System.in);
   
        System.out.println("------Seleccione el Programa ----");
        System.out.println("--(1) LANA                   ----");
        System.out.println("--(2) ROPA MUY SUCIA         ----");
        System.out.println("--(3) ECONOMICO              ----");
        System.out.println("--(4) ROPA DE BEBE           ----");
        System.out.println("---------------------------------");
        System.out.print(":");
        int prog = programa.nextInt();
        
        Programas mensajero = new Programas(prog);
        Lavarropas mensajero2 = new Lavarropas();
               
        mensajero.display();
        mensajero2.especificaciones();
        
        
        
        
        
        
   }

    private static Programas Programas(int prog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
