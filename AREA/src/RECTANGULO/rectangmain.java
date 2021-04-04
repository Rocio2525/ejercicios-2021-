
package RECTANGULO;
import java.util.Scanner;

public class rectangmain {
    public static void main(String[] args){
     Scanner entrada = new Scanner(System.in);
     
     System.out.print("Ingrese la Base del rectangulo:");
     int base = entrada.nextInt();
     
     System.out.print("Ingrese la Altura del rectangulo:");
     int altura = entrada.nextInt();
     
     rectang valores = new rectang(base, altura);    
     valores.Imprimir();
}
}