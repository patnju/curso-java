public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        // System tiene un metodo que retorna el tiempo en mili segundos y es de tipo long
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++){
            //c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms - 1.000 => 4ms - 10.000 => 100ms - 100.000 => 5506ms
            //c += a + b + "\n"; // 500 => 15ms - 1.000 => 15ms - 10.000 => 65ms - 100.000 => 2239ms
            sb.append(a).append(b).append("\n"); // 500 => 0ms - 1.000 => 0ms - 10.000 => 2ms - 100.000 => 12ms
        }

        long fin = System.currentTimeMillis();
        System.out.println("c = " + c);
        System.out.println("sb.toString() = " + sb.toString());
        System.out.println(fin - inicio);
    }
}
