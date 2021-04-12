import java.util.Locale;

public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if (!esNulo){
            curso = " "; //""Programación Java";
        }

        boolean esVacio = curso.length() == 0;

        System.out.println("esVacio = " + esVacio);

        // Valida si es vacío)
        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        if(!esVacio2){
            System.out.println(curso.toUpperCase());
        }

        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);
        if (esBlanco){
            System.out.println("Bienvenido al curso ".concat(curso));
        }

        // NullPointerException, siempre que el error venga de algún valor nulo

        // No puedo concatenar un String con un valor nulo
        // System.out.println("Bienvenido al curso ".concat(curso));

        // Error, dado que curso es nulo, va a lanzar un nullpointer
        // System.out.println(curso.concat(" desde cero!"));

        // De esta forma no da error
        System.out.println("Bienvenido al curso "+ curso);




    }
}
