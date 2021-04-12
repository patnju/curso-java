public class ConversionDeTipos {
    public static void main(String[] args) {

        //String a promitivos
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroStr = " + numeroInt);

        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);
        
        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        //variable!
        var varNumeroStr = "50";
        var varNumeroInt = Integer.parseInt(varNumeroStr);
        System.out.println("varNumeroStr = " + varNumeroInt);

        var varRealStr = "98765.43e-3";
        var varRealDouble = Double.parseDouble(varRealStr);
        System.out.println("varRealDouble = " + varRealDouble);

        var varLogicoStr = "true";
        var varLogicoBoolean = Boolean.parseBoolean(varLogicoStr);
        System.out.println("varLogicoBoolean = " + varLogicoBoolean);

        //Primitivos a String

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        String otraFormaNumeroStr = String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroStr = " + otraFormaNumeroStr);
        
        double otroRealDouble = 98765.43e-3;
        System.out.println("otroRealDouble = " + otroRealDouble);
        String otroRealStr = Integer.toString(otroNumeroInt);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456F);
        System.out.println("otroRealStr = " + otroRealStr);

        //Conversión de primitivos a primitivos

        int i = 42768;
        short s = (short)i; //Castear la conversión del dato hacia abajo solamente
        // No es capaz de convertir un valor más alto, solo se puede converir los valores
        // que corresponden al tipo de dato
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char ch = (char) i;
        System.out.println("ch = " + ch);
        float f = (float) i;
        System.out.println("f = " + f);
    }
}
