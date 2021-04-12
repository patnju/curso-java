public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("programación java");

        // Compara la referencia del objeto
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2: " + esIgual);

        // Compara por valores, deben ser iguales, si falta un tilde o una mayuscula el resultado será false
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2): " + esIgual);

        //Compara por valores, ignora mayuscula y minuscula
        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("curso.equalsIgnoreCase(curso2): " + esIgual);

        /*Cuando se crea en la literal y luego se crea otro en la literal
        esto compara las literales o las referenciasl del objeto y las considera
        iguales*/
        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3: " + esIgual);

        // Ejemplos de concatenación

    }
}
