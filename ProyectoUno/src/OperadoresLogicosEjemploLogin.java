import java.util.Scanner;

public class OperadoresLogicosEjemploLogin {
    public static void main(String[] args) {
        String username = "JP";
        String password = "1234";

        String username2 = "admin";
        String password2 = "1234";

        Scanner sc = new Scanner(System.in);

        System.out.println(" Ingrese el username ");
        String u = sc.next();
        System.out.println(" Ingrese el password ");
        String p = sc.next();

        boolean esAutenticado = false;

        if((username.equalsIgnoreCase(u) && password.equals(p))
            || (username2.equalsIgnoreCase(u) && password2.equals(p))){
            esAutenticado = true;
        }

        if (esAutenticado){
            System.out.println(" ¡Bienvenido ".concat(u).concat("!"));
        }else{
            System.out.println(" Datos incorrectos ");
        }
    }
}
