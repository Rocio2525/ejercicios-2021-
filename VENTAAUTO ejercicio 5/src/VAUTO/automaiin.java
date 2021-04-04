
package VAUTO;

import java.util.Scanner;

public class automaiin {
    public static void main(String[] arg){
     
 
      Scanner entrada = new Scanner(System.in);
      System.out.print("Ingrese LA MARCA del AUTO :");
      String marca=entrada.next();
       System.out.print("Ingrese  EL MODELO  del AUTO:");
      String modelo=entrada.next();
         
    
       System.out.print("Ingrese la cantidad de km que tiene el auto:" );
    int kilometraje=entrada.nextInt();    
  
    Auto atributos = new Auto(marca,modelo,kilometraje);  
     atributos.imprimir();
    atributos.estadoauto();
    
    
    
    }
}
