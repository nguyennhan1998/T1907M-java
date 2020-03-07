package assignment6fix;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;
import java.sql.*;

public class List implements Initializable {
    public ListView<Product> lsView= new ListView();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
         try{
             Class.forName("com.mysql.jdbc.Driver");
             //step 3
             String url="jdbc:mysql://localhost:3306/T1907m";
             String username="root";
             String password="";
             //step 4
             Connection conn= DriverManager.getConnection(url,username,password);
             //queru sql
             String sql_text="select * from products";
             Statement stm=conn.createStatement();
             ResultSet rs=stm.executeQuery(sql_text);
             ObservableList ls= FXCollections.observableArrayList();
             while(rs.next()){
              Product p= new Product(rs.getInt("id"),rs.getString("name"),rs.getString("description"),rs.getDouble("price"),rs.getInt("quantity"));
              ls.add(p);
             }
             lsView.setItems(ls);

         }catch (Exception e){
             System.out.println(e.getMessage());
         }
    }
    public void form(){
        try{
            Parent form= FXMLLoader.load(getClass().getResource("formproduct.fxml"));
            Main.productStage.getScene().setRoot(form);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void addToCart(){
        Product selected=lsView.getSelectionModel().getSelectedItem();
        Main.cart.add(selected);
        System.out.println("add to cart successfully");

    }
    public void cart(){
        try{
            Parent cart=FXMLLoader.load(getClass().getResource("cart.fxml"));
            Main.productStage.getScene().setRoot(cart);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
