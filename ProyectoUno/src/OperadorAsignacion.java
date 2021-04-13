import javax.lang.model.SourceVersion;

public class OperadorAsignacion {
    public static void main(String[] args) {
        int i = 5;
        System.out.println("i = " + i);
        int j = i + 4;
        System.out.println("j = " + j);
        i = i + 2;
        System.out.println("i = " + i);
        i += 2;
        System.out.println("i = " + i);
        
        i += 5;
        System.out.println("i = " + i);

        j -= 2;
        System.out.println("j = " + j);

        j *= 2;
        System.out.println("j = " + j);

        String sqlString = "SELECT * FROM CLIENTES AS C";
        sqlString += " WHERE NOMBRE = 'Juan'";
        sqlString += " AND C.ACTIVO = 1";
        System.out.println("sqlString = " + sqlString);
    }
}
