package assignment6;
import  java.sql.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;


import java.net.URL;
import java.util.ResourceBundle;

public class List implements Initializable {
    public ListView<Product> lsView= new ListView<>();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/T1907m";
            String username="root";
            String password="";
            Connection conn=DriverManager.getConnection(url,username,password);
            Statement stm=conn.createStatement();
            String sql_text="select * from products";
            ResultSet rs=stm.executeQuery(sql_text);
            ObservableList ls= FXCollections.observableArrayList();
            while(rs.next()){
                Product pr= new Product(rs.getInt("id"),rs.getString("name"),rs.getString("description"),rs.getDouble("price"),rs.getInt("quantity"));
                ls.add(pr);
            }
            lsView.setItems(ls);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
    public void form(){
        try{
            Parent form= FXMLLoader.load(getClass().getResource("form.fxml"));
            Main.productStage.getScene().setRoot(form);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public void addToCart(){
        Product selected=lsView.getSelectionModel().getSelectedItem();
        Main.cart.add(selected);
        System.out.println("add an item successfully");

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
