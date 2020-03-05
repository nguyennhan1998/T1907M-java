package test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Main extends Application {
    public static ArrayList<Student> students= new ArrayList<>();


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("form.fxml"));
        primaryStage.setTitle("nhap thong tin sinh vien");
        primaryStage.setScene(new Scene(root,600,400));
        primaryStage.show();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url ="jdbc:mysql://localhost:3306/t1907m";
            String username="root";
            String password="";
            Connection conn= DriverManager.getConnection(url,username,password);
            System.out.println("ket noi mysql thanh cong");
            Statement stm= conn.createStatement();
            stm.executeUpdate("insert into students "+"(name,age,mark)"+"values('nhan','22','10')");
            System.out.println("all goood");
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
