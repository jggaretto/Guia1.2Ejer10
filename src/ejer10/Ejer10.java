
package ejer10;


public class Ejer10 {

   
    public static void main(String[] args) {
         // Crear una instancia de la clase Pensador
        Pensador pensador = new Pensador(3915);

        // Probar todos los métodos y mostrar los resultados por consola
        System.out.println("Valor original: " + pensador.getValor());
        System.out.println("Valor invertido: " + pensador.invertir());
        System.out.println("Par anterior: " + pensador.parAntes());
        System.out.println("Par posterior: " + pensador.parPosterior());
        System.out.println("Primer dígito: " + pensador.primerDigito());
        System.out.println("Último dígito: " + pensador.ultimoDigito());
        
    }
    
}
