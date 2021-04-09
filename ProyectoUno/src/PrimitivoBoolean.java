public class PrimitivoBoolean {
    public static void main(String[] args) {
        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        boolean datoLogicoDos = Boolean.FALSE.booleanValue();
        System.out.println("datoLogicoDos = " + datoLogicoDos);

        double d = 98765.43e-3; // 98.76543
        float f = 1.2345e2F; //123.45

        datoLogico = d > f;
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = 3-2 == 1;
        System.out.println("esIgual = " + esIgual);
    }
}
