
package VAUTO;
import java.util.Scanner;

public class Auto {
   String marca,modelo;
  int kilometraje;
  
  
   public void estadoauto(){
       Scanner entrada = new Scanner(System.in);
       System.out.print("Ingrese la cantidad de km que tiene el auto:" );
    int kilometraje=entrada.nextInt();
 
            if (kilometraje>0 && kilometraje<10000){
            System.out.println("poco usado");
        }
        else if (kilometraje>=10000 && kilometraje<100000){
            System.out.println("usado");          
             }
        else if (kilometraje>=100000){
            System.out.println("bastante usado");
        }
        else{
            System.out.println("Esta nuevo");
        }
        }
     
    }
      
   

    

            
           
   
   

