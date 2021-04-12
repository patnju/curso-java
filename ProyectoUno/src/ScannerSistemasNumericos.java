import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerSistemasNumericos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        //String numeroStr = sc.nextLine();
        int numeroDecimal = 0;
        try{
            numeroDecimal = sc.nextInt(); //Integer.parseInt(numeroStr);
        }catch (InputMismatchException e){ //La excepción podría ser solo Exception, dado que esta es la padre y de ella desprenden todas las otras
            System.out.println("Debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        String resultadoDecimal = "numeroDecimal = " + numeroDecimal;

        String resultadoBinario = "numero binario = " + Integer.toBinaryString(numeroDecimal);

        String resultadoHexa = "numero Hexadecimal = " + Integer.toHexString(numeroDecimal);

        String resultadoOctal = "numero Octal = " + Integer.toOctalString(numeroDecimal);

        int numeroOctal = 036;
        String mensaje = resultadoDecimal + "\n" +
                            resultadoBinario + "\n" +
                            resultadoHexa + "\n" +
                            resultadoOctal;
        System.out.println(mensaje);

    }
}
