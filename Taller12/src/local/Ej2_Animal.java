
package local;

/**
 *
 * @author Daniel
 */
public class Ej2_Animal implements Ej2_Nadador, Ej2_Volador{

    public Ej2_Animal() {
    }
    
    @Override
    public void nadar() {
        System.out.println("el animal esta nadando");
    }

    @Override
    public void volar() {
        System.out.println("el animal esta volando");
    }
    
}
