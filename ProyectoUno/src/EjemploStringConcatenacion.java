public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzman";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;
        //Siempre que encuentre una cadena, los números A y B los considera como cadena
        System.out.println(detalle + numeroA + numeroB);

        //Al estar en un parentesis resuelve la suma
        System.out.println(detalle + (numeroA + numeroB));

        // Al ser un número el primero, realiza la suma y luego concatena con el detalle
        System.out.println(numeroA + numeroB + detalle);

        String detalle2 = curso.concat(profesor);
        System.out.println(detalle2);

        detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println(detalle2);

        detalle2 = curso.concat(" con ".concat(profesor));
        System.out.println(detalle2);
    }
}
