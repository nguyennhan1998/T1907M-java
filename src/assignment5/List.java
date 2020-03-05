package assignment5;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import lab1fix.Student;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class List implements Initializable {
    public ListView<Student> lsView= new ListView();

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
            String sql_text="SELECT * FROM students";
            Statement stm=conn.createStatement();
            ResultSet rs=stm.executeQuery(sql_text);
            //1 danh sach cho fx
            ObservableList ls= FXCollections.observableArrayList();
            while (rs.next()){
                Student st= new Student(rs.getString("name"),rs.getInt("age"),rs.getInt("mark"));
                ls.add(st);

            }
            lsView.setItems(ls);


        }catch (Exception e){

        }
    }
public void form(){
//day la noi chuyen man hinh
    try{
        Parent form= FXMLLoader.load(getClass().getResource("form.fxml"));
        Main.mainStage.getScene().setRoot(form);

    }catch (Exception e){


    }
}
}
