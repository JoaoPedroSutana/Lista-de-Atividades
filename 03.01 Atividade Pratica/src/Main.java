import java.sql.Connection;

public class Main {
    public static void main(String[] args){
        Connection con = ConnectionFactory.conectar();

        if (con != null){
            System.out.println("Conectado!");
        }
        else {
            System.out.println("Não conectado!");
        }
    }
}