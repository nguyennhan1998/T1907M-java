package assignment6;



import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

import java.sql.*;
public class InputProduct {
public TextField txtName= new TextField();
public TextField txtDesc= new TextField();
public TextField txtPrice= new TextField();
public TextField txtAmount= new TextField();
public void submitForm() throws  Exception{
    try{
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/T1907m";
        String username="root";
        String password="";
        Connection conn=DriverManager.getConnection(url,username,password);
        String name=txtName.getText();
       String desc=txtDesc.getText();
       Integer price;
       Integer amount;
       price=Integer.parseInt(txtPrice.getText());
       amount=Integer.parseInt(txtAmount.getText());
       // Product pr= new Product(name,desc,price,amount);
        Statement stm=conn.createStatement();
        String sql_text= "insert into product(name,des,price,amount) values('"+name+"','"+desc+"',"+price+","+amount+")";
        int num=stm.executeUpdate(sql_text);
        if(num>0){
            Parent list= FXMLLoader.load(getClass().getResource("listproduct.fxml"));
            Main.mainStage.getScene().setRoot(list);
        }else{
            System.out.println( "error");
        }



    }catch (Exception e){
        System.out.println(e.getMessage());
    }
}
}
