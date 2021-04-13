public class OperadorIncrementoDecremento {
    public static void main(String[] args) {

        // preincremento -> Incrementa y luego devuelve
        int i = 1;
        int j = ++i; // i = i + 1 -> Se incrementa y luego se asigna
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // postincremento - se asigna primero y luego se incrementa, por eso el i va a valer el incremento y el j el valor que tenía i y que fue asignado
        //  primero devuelve y luego Incrementa
        i = 2;
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // pre decremento

        i = 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // post decremento

        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("++j = " + (++j));
        System.out.println("j++ = " + (j++));
        System.out.println("j = " + j);
    }

}
