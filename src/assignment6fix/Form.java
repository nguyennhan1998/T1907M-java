package assignment6fix;
import  connector.Connector;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.*;
import java.sql.*;

public class Form {
    public TextField txtName= new TextField();
    public TextArea txtDescription= new TextArea();
    public TextField txtPrice= new TextField();
    public TextField txtQuantity= new TextField();
    public void submit(){
        try{

            String name=txtName.getText();
            String desc=txtDescription.getText();
            Double price=Double.parseDouble(txtPrice.getText());
            Integer   qty=Integer.parseInt(txtQuantity.getText());
            String sql_text="insert into products(name,description,price,quantity) values('"+name+"','"+desc+"',"+price+","+qty+")";
            Connector connector = Connector.getInstance();


            if( connector.excuteUpdate(sql_text)){
                Parent form= FXMLLoader.load(getClass().getResource("listproduct.fxml"));
                Main.productStage.getScene().setRoot(form);
            }



        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
