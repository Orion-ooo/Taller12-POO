
package local;

/**
 *
 * @author Daniel
 */
public class NewMain {

    public static void main(String[] args) {
        
        //Ejercicio 1
        Ej1_Persona persona1 = new Ej1_Persona("Jhon");
        persona1.hablador();
        
        Ej1_Persona persona2 = new Ej1_Persona("Daniel");
        persona2.trabajar();
        
        //Ejercicio 2
        Ej2_Animal animal = new Ej2_Animal();
        animal.nadar();
        animal.volar();
    }
    
}
