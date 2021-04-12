public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzman";


        String resultado = curso.concat(profesor);
        System.out.println("Curso: " + curso);
        System.out.println("Resultado: " + resultado);
        System.out.println(curso == resultado);

        /* Ocupa expresiones lambda en Java, o funciones de flecha o funciones anonimas
        * recibe el parametro y lo modificamos, en este caso recibe curso y aplicamos
        * transform para transformarlo, en este caso vamos a concatenar*/
        curso.transform(c -> {
            return c + " con " + profesor;
        }); 
        // En este caso si bien hicimos una modificación, este se mantiene inmutable
        // Acá se imprime inmutable el valor de curso
        System.out.println("curso = " + curso);
        String resultado2 = 
            curso.transform(c -> {
                return c + " con " + profesor;
            });
        System.out.println("resultado2 = " + resultado2);

        // Reemplazar cualquier caracter
        resultado.replace("a", "A");
        // No debería hacer cambios, dado que es inmutable
        System.out.println("resultado = " + resultado);

        // Reemplazar cualquier caracter
        String resultado3 =
            resultado.replace("a", "A");
        // No debería hacer cambios
        System.out.println("resultado3 = " + resultado3);
    }
}
