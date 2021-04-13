import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {

        //otra forma de definir variables
        int i = 5, j = 4, suma = i + j;

        System.out.println("suma = " + suma);

        System.out.println("i + j = " + i + j);
        System.out.println(i + j + " i + j");
        // los parentesis tienen máxima prioridad
        System.out.println("i + j = " + (i + j));

        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("resta = " + (i - j));

        int multiplicacion = i * j;
        System.out.println("multiplicacion = " + multiplicacion);

        float division = (float)i / (float)j;
        System.out.println("division = " + division);

        int resto = i % j;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor numerico"));
        if(numero%2 == 0){
            System.out.println("numero = " + numero + " es par");
        }else  {
            System.out.println("numero = " + numero + " es impar");
        }
    }
}
