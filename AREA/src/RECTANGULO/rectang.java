
package RECTANGULO;

public class rectang {
  private int base, altura, area;
    
   public rectang(int base,int altura){
       this.base = base;
       this.altura = altura;
    
   }
    
    public void calculoArea(){
        area = base * altura;
           
    }
    
    public void Imprimir(){
        calculoArea();
        System.out.println("El área es:" + area);
    
    }
    
      
}
