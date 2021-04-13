import java.util.Arrays;

public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        
        String trabalenguas = "trabalenguas";

        //convertir en un arreglo
        System.out.println("trabalenguas.toCharArray() = "
                + trabalenguas.toCharArray());


        char[] arreglo = trabalenguas.toCharArray();
        for (int i=0; i<arreglo.length; i++){
            System.out.print(arreglo[i]);
        }
        System.out.println();
        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));

        String [] arreglo2 = trabalenguas.split("a");

        for (int i=0; i<arreglo2.length; i++){
            System.out.println(arreglo2[i]);
        }

        String archivo = "alguna.imagen.pdf";

        //con doble backslash puedo utilizar el punto, dado que el punto es un caracter especial, tambien sirve
        // utilizando corchetes
        String [] archivoArr = archivo.split( "\\.");

        for (int k = 0; k<archivoArr.length; k++) {
            System.out.println(archivoArr[k]);
        }
        System.out.println();
        System.out.println("extension = " + archivoArr[archivoArr.length-1]);

    }
}
