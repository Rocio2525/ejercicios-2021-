
package MASCOTAS;

import java.util.Scanner;

public class PERROMAIN {
     public static void main(String[] arg){
    
     Scanner entrada = new Scanner(System.in);
      System.out.print("Ingrese LA RAZA de la mascota:");
      String raza=entrada.next();
       System.out.print("Ingrese EL COLOR de la mascota:");
      String color=entrada.next();
         
     PERRO atributos = new PERRO(raza,color);    
     atributos.imprimir();
     
}
      
      
}
