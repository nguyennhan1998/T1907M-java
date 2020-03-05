package assignment5;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import lab1fix.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Form {
    public TextField txtName= new TextField();
    public TextField txtAge= new TextField();
    public TextField txtMark= new TextField();
    public void submitStudent() throws Exception{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //step 3
            String url="jdbc:mysql://localhost:3306/t1907m";
            String username="root";
            String password="";
            //step 4
            Connection conn= DriverManager.getConnection(url,username,password);
            String name=txtName.getText();
            Integer age;
            Integer mark;
            age=Integer.parseInt(txtAge.getText());
            mark=Integer.parseInt(txtMark.getText());
            Student s= new Student(name,age,mark);
            String sql_text="INSERT INTO students(name,age,mark) VALUES('"+name+"',"+age+","+mark+")";
            Statement stm= conn.createStatement();
           int row_number= stm.executeUpdate(sql_text);
            if(row_number>0){
                //chuyen ve man hinh danh sach
                Parent list= FXMLLoader.load(getClass().getResource("list.fxml"));
                Main.mainStage.getScene().setRoot(list);
            }else{
                //thong bao gi do

            }



        }catch (Exception e){
            System.out.println(e.getMessage());
        }




    }
}
