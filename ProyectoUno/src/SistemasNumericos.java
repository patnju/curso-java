import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        String resultadoDecimal = "numeroDecimal = " + numeroDecimal;
        System.out.println(resultadoDecimal);

        String resultadoBinario = "numero binario = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);



        String resultadoHexa = "numero Hexadecimal = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexa);

        String resultadoOctal = "numero Octal = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);

        int numeroOctal = 036;
        String mensaje = resultadoDecimal + "\n" +
                            resultadoBinario + "\n" +
                            resultadoHexa + "\n" +
                            resultadoOctal;
        JOptionPane.showMessageDialog(null, mensaje) ;

    }
}
