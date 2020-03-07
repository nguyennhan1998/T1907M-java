package assignment6;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.sql.*;

public class Form {
 public TextField txtName=new TextField();
 public TextArea txtDescription= new TextArea();
 public TextField txtPrice= new TextField();
 public TextField txtQuantity= new TextField();
 public void submit(){
     try{
         Class.forName("com.mysql.jdbc.Driver");
         String url="jdbc:mysql://localhost:3306/T1907m";
         String username="root";
         String password="";
         Connection conn=DriverManager.getConnection(url,username,password);
         String name=txtName.getText();
         String desc=txtDescription.getText();
         Double price=Double.parseDouble(txtPrice.getText());
         Integer qty=Integer.parseInt(txtQuantity.getText());
         String sql="insert into products(name,description,price,quantity) values(?,?,?,?)";
         PreparedStatement prStm=conn.prepareStatement(sql);
         prStm.setString(1,name);
         prStm.setString(2,desc);
         prStm.setDouble(3,price);
         prStm.setInt(4,qty);
         if(!prStm.execute()){
             Parent form= FXMLLoader.load(getClass().getResource("list.fxml"));
             Main.productStage.getScene().setRoot(form);
         }






     }catch (Exception e){
         System.out.println(e.getMessage());
     }
 }
}
