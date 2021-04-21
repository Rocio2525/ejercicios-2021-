
package MASCOTAS;


public class PERRO {
   private String nombre;
   private String raza;
    private String color;
    private int edad;
    
    public PERRO(String raza, String color){
this.raza=raza;
this.color=color;

}


public void imprimir (){
    System.out.println("LA RAZA DE LA MASCOTA es "+getRaza());
    System.out.println("EL COLOR  DE LA MASCOTA es "+getColor());
}


//public void ladrar(){
//System.out.println("gua gua");

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
        }
