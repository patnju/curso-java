import java.util.Locale;

//Publico por que se puede ejecutar desde cualquier ldo
public class HolaMundo {
    //void --> no retorna nada
    //main -> clase principal, en donde se ejecuta el programa
    //Las llaves delimitan el contexto o el alcance de la clase
    // escribir psvm + TAB y se llena solo, al igual que con MAIN + TAB
    public static void main(String[] args){
        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase(Locale.ROOT) = " + saludar.toUpperCase(Locale.ROOT));

        Integer numero = 11;


        boolean valor = true;
        Integer numero2 = 5;
        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

        var numero3 = "15";

        String nombre;

        nombre = "Juan";

        if(numero >10){
            nombre = "Andres";
        }

        System.out.println("nombre = " + nombre);

        System.out.println();

    }
}


