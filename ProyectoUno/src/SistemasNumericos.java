public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binario = " + Integer.toBinaryString(numeroDecimal));

        System.out.println("numero Hexadecimal = " + Integer.toHexString(numeroDecimal));
        System.out.println("numero Octal = " + Integer.toOctalString(numeroDecimal));
        
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);
    }
}
