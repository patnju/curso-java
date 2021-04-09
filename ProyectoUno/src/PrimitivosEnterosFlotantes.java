public class PrimitivosEnterosFlotantes {

    static float varFlotante;

    public static void main(String[] args) {
        byte  numeroByte = 1;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("El valor máximo de un byte " + Byte.MAX_VALUE);
        System.out.println("El valor máximo de un byte " + Byte.MIN_VALUE);

        short  numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("Tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("El valor máximo de un short " + Short.MAX_VALUE);
        System.out.println("El valor máximo de un short " + Short.MIN_VALUE);

        int  numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("El valor máximo de un int " + Integer.MAX_VALUE);
        System.out.println("El valor máximo de un int " + Integer.MIN_VALUE);

        long  numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("Tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("El valor máximo de un long " + Long.MAX_VALUE);
        System.out.println("El valor máximo de un long " + Long.MIN_VALUE);

        var numeroVar = 2147483647;

        // Tipos de dato primitivo que son puntos flotantes, es dado que la memoria tiene un límite y en este caso se traduce a una notación científica

        float  realFloat = 3.4028235E3F;
        System.out.println("realFloat = " + realFloat);
        System.out.println("Tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("Tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("El valor máximo de un float " + Float.MAX_VALUE);
        System.out.println("El valor máximo de un float " + Float.MIN_VALUE);

        double  realDouble = 1.7976931348623157E308;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("Tipo double corresponde en bites a " + Double.SIZE);
        System.out.println("El valor máximo de un double " + Double.MAX_VALUE);
        System.out.println("El valor máximo de un double " + Double.MIN_VALUE);

        // Los valores por defecto de los numericos es 0 y de los valores flotantes es 0.0
        // la variable varFlotante no está inicializada y no requiere que esté inicializada porque está definida en una variable estática fuera del main
        System.out.println("varFlotante = " + varFlotante);
    }
}
