
package BANCO;

import java.util.Scanner;

/*Crear la clase cuentaBancaria que tenga como atributo 
nombreTitular, tipoDeCuenta y saldo. Elegir el tipo de dato 
adecuado para cada uno de ellos. Además hacer el método extraer()
que permita extraer dinero, si se puede. Crear un objeto de esta 
clase y comprobar el funcionamiento*/
public class Usuario {
   String nombre;
   String tipo_Cuenta;
   double saldo;

public void extraer(){
  Scanner entrada = new Scanner(System.in);
       System.out.print("ingrese el monto que desea retirar :" );
    double saldo=entrada.nextDouble();

            if (saldo>0 && saldo<5000){
            System.out.println("---QUIERE IMPRIMIR EL TICKET----");
        }
        else if (saldo >=5000 && saldo<10000){
            System.out.println("---QUIERE IMPRIMIR EL TICKET----");          
             }
        else if (saldo<0){
            System.out.println("SU CUENTA NO TIENE SALDO");
        }
        else{
            System.out.println("MUCHAS GRACIAS ");
        }
        }


}





