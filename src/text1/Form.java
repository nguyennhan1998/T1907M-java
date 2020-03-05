package text1;
//khai bao package sql

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.*;

public class Form {

    public TextField txtName= new TextField();
    public TextField txtAge= new TextField();
    public TextField txtMark= new TextField();

  public void submitStudent(){
      //khai bao driver
      try{
          //khai bao driver
          Class.forName("com.mysql.jdbc.Driver");
          //tao url cho co so du lieu
          String url="jdbc:mysql://localhost:3306/T1907m";
          String username="root";
          String password="";
          //ket noi voi co so duo lieu
          Connection conn=DriverManager.getConnection(url,username,password);
          String name=txtName.getText();
          Integer age=Integer.parseInt(txtAge.getText());
          Integer mark=Integer.parseInt(txtMark.getText());
          Student st= new Student(name,age,mark);
          //insert vao co so du lieu
          Statement stm=conn.createStatement();
          String sql_text="insert into students (name,age,mark) values ('"+name+"',"+age+","+mark+")";
          int number=stm.executeUpdate(sql_text);
          if(number>0){
              Parent list= FXMLLoader.load(getClass().getResource("list.fxml"));
              Main.mainStage.getScene().setRoot(list);
          }
      }catch (Exception e){
          System.out.println(e.getMessage());
      }
  }
 }
