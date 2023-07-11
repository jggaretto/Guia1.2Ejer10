/*
 En un nuevo proyecto, crear una clase de nombre Pensador con un atributo que almacenará
un valor entero; un constructor que permita inicializar dicho atributo; los métodos get y set para
dicho atributo y los siguientes métodos adicionales:
 invertir(): Este método retornará el valor guardado en el atributo con sus cifras
invertidas. Por ejemplo si el valor guardado es 3915, retornará 5193
 parAntes(): Este método retornará el valor par próximo anterior al valor guardado.
 parPosterior(): Este método retornará el valor par próximo posterior al valor
guardado.
 primerDigito(): Este método retornará el primer dígito del valor guardado.
 ultimoDigito(): Este método retornará el último dígito del valor guardado.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear una instancia de la clase Pensador.
b) Probar todos sus métodos y mostrar por consola los resultados obtenidos.
 */
package ejer10;


public class Pensador {
    private int valor;

    // Constructor
    public Pensador(int valor) {
        this.valor = valor;
    }

    // Getter y Setter
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    // Método para invertir el valor almacenado
    public int invertir() {
        int valorInvertido = 0;
        int num = valor;
        while (num != 0) {
            int digito = num % 10;
            valorInvertido = valorInvertido * 10 + digito;
            num /= 10;
        }
        return valorInvertido;
    }

    // Método para obtener el valor par próximo anterior
    public int parAntes() {
        int parAnterior = valor;
        while (parAnterior % 2 != 0) {
            parAnterior--;
        }
        return parAnterior;
    }

    // Método para obtener el valor par próximo posterior
    public int parPosterior() {
        int parPosterior = valor;
        while (parPosterior % 2 != 0) {
            parPosterior++;
        }
        return parPosterior;
    }

    // Método para obtener el primer dígito del valor almacenado
    public int primerDigito() {
        int primerDigito = valor;
        while (primerDigito >= 10) {
            primerDigito /= 10;
        }
        return primerDigito;
    }

    // Método para obtener el último dígito del valor almacenado
    public int ultimoDigito() {
        return valor % 10;
    } 
}
