public class CaracterRename {
    public static void main(String[] args) {
        System.out.println("Hola hola");
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);

        char car = '\u0040';
        System.out.println("car = " + car);

        char decimal = 64;
        System.out.println("decimal = " + decimal);

        System.out.println("simbolo = decimal: " + (simbolo == decimal));

        System.out.println("char corresponde en byte a " + Character.BYTES);
        System.out.println("char corresponde en bites a " + Character.SIZE);
        System.out.println("char Max value " + Character.MAX_VALUE);
        System.out.println("char Min value " + Character.MIN_VALUE);

    }

}
