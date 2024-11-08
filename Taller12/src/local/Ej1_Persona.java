
package local;

/**
 *
 * @author Daniel
 */
public class Ej1_Persona implements Ej1_Hablador, Ej1_Trabajor{
    private String nombre;

    public Ej1_Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override public void hablador() {
        System.out.println("la persona " + nombre + " esta hablando en lugar de trabajar");
    }

    @Override public void trabajar() {
        System.out.println("la persona " + nombre + " esta trabajando, como debe ser");
    }
    
}
