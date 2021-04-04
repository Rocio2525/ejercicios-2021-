
package VAUTO;
import java.util.Scanner;

public class Auto {
   String marca,modelo;
  int kilometraje;
  
   public Auto(String marca, String modelo,int kilometraje){
this.marca=marca;
this.modelo=modelo;
this.kilometraje=kilometraje;
   }

  
   public void estadoauto(){
       
 
            if (kilometraje>0 && kilometraje<10000){
            System.out.println("Poco usado");
        }
        else if (kilometraje>=10000 && kilometraje<100000){
            System.out.println("Usado");          
             }
        else if (kilometraje>=100000){
            System.out.println("Bastante usado");
        }
       
        
        }
     public void imprimir (){
    System.out.println("LA MARCA DEL AUTO es "+marca);
    System.out.println("EL MODELO DEL AUTO es "+modelo);
    System.out.println("LA CANTIDAD DE KM es "+ kilometraje);  
    }
      
} 

          

            
           
   
   

