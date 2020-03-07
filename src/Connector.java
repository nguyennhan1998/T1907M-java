import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connector {
    private String url="jdbc:mysql://localhost:3306/T1907m";
    private String username="root";
    private String password="";
   private Statement stm;
    public Connector(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection(url,username,password);
            stm=conn.createStatement();


        }catch (Exception e){

        }
    }
}
