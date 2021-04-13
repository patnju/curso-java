public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        
        // Este es un ejemplo para buscar archivos o identificar que tipo de archivo llega
        String archivo = "alguna_imagen.jpeg";
        String archivo2 = "alguna.imagen.pdf";
        int i = archivo.indexOf(".");
        int l = archivo2.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(14) = " + archivo.substring(14));
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(i+1));
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo2.substring(l+1));



    }
}
