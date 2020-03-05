package session5;
//import thu vien java.sql
import  java.sql.*;


public class DemoDatabase {
    public static void main(String[] args) {
        try{
            //b2 khai bao driver
            Class.forName("com.mysql.jdbc.Driver");
            //b3 tao url db
            String url ="jdbc:mysql://localhost:3306/t1907m";
            String username="root";
            String password="";
            //b4 ket noi db
            Connection conn= DriverManager.getConnection(url,username,password);
            System.out.println("ket noi mysql thanh cong");
            //truy van lay student
            Statement stm= conn.createStatement();

            String sql_text="SELECT * FROM students";
            ResultSet rs=stm.executeQuery(sql_text);
            while(rs.next()){
                String line=rs.getInt("id")+"-"+rs.getString("name");
                System.out.println(line);
            }
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}
