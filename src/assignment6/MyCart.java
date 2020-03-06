package assignment6;

import javafx.fxml.Initializable;
import  java.sql.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;


public class MyCart implements Initializable {
    public ListView<Product> ls1View= new ListView<>();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{
            //declare driver
            Class.forName("com.mysql.jdbc.Driver");
            //create url database
            String url="jdbc:mysql://localhost:3306/T1907m";
            String username="root";
            String password="";
            //connect to database
            Connection conn=DriverManager.getConnection(url,username,password);
            //select du lieu tu trong bang product
            String sql_text="select * from product";
            Statement stm=conn.createStatement();
            ObservableList ls= FXCollections.observableArrayList();
            ResultSet rs=stm.executeQuery(sql_text);
            while(rs.next()){
                Product pr=new Product(rs.getString("name"),rs.getString("des"),rs.getInt("price"),rs.getInt("amount"));
                ls.add(pr);
            }
            ls1View.setItems(ls);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public void form(){
        try{
            Parent form= FXMLLoader.load(getClass().getResource("inputproduct.fxml"));
            Main.mainStage.getScene().setRoot(form);


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void add(){

    }
}
