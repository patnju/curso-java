import java.util.Locale;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Juan Pablo";
        int largoNombre = nombre.length();
        System.out.println("nombre.length() = " + largoNombre);
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toUpperCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals() Igual = " + nombre.equals("Juan Pablo"));
        System.out.println("nombre.equals() Mayusc -> Minusc = " + nombre.equals("juan pablo"));
        System.out.println("nombre.equalsIgnoreCase(\"juan pablo\") = " + nombre.equalsIgnoreCase("juan pablo"));
        System.out.println("nombre.compareTo(\"Juan Pablo\") = " + nombre.compareTo("Juan Pablo")); //Si es 0 son identicos
        System.out.println("nombre.compareTo(\"Juan Pablo\") = " + nombre.compareTo("Javier")); //Si es 0 son identicos
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); //Obtener primer caracter
        System.out.println("nombre.charAt(3) = " + nombre.charAt(3)); // Obtener el cuarto caracter
        System.out.println("nombre.charAt(3) = " + nombre.charAt(nombre.length()-1)); // Obtener el ultimo dinamicamente
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(5, último) = " + nombre.substring(5,largoNombre));

        //Más metodos interesantes del String

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace() = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a')); // busca donde está el caracter, validar si existe dentro de una cadena, busca el primero que encuentre
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); // busca la última a y retorna la posición
        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf('z')); // Si no lo encuentra retorna un -1

        // podríamos preguntar, si existe un caracter con el indexof para validar un número >= 0
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t")); // retorna true o false, para saber si un string está dentro de un string
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("z")); // retorna true o false, para saber si un string está dentro de un string
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas")); // retorna true o false
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as"));
        System.out.println("    trabalenguas   ");
        System.out.println("    trabalenguas  ".trim());


    }
}
