import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RepositorioCachorro {
    public static void main(String[] args) throws Exception {
        
        public boolean salvarAe (Cachorro cachorro){

            //conectar

            String url = "jdbc:mysql://localhost:3306/aulatito11";
            String usuario = "root";
            String senha = "root";

            Connection con = DriverManager.getConnection(url,usuario, senha);

            //preparar

            String sql = "INSERT INTO cachorro (nome, sexo, raca) VALUES(?,?,?)";
            PreparedStatement ps = con.createStatement(sql);
            
            //enviar o camando

        }       


    }
}
