public class PrimitivosCaracter {
    public static void main(String[] args) {
        System.out.println("Hola hola");
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);

        char car = '\u0040';
        System.out.println("car = " + car);

        char decimal = 64;
        System.out.println("decimal = " + decimal);

        System.out.println("simbolo = decimal: " + (simbolo == decimal));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en \bbyte a " + espacio + Character.BYTES);
        System.out.println("char corresponde en bites a " + nuevaLinea + retroceso + Character.SIZE);
        System.out.println("char Max value " + tabulador + Character.MAX_VALUE);
        System.out.println("char Min \n value " + retornoCarro + Character.MIN_VALUE);


    }

}
