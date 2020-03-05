package text1;
//import package sql
import java.sql.*;

import com.sun.deploy.util.FXLoader;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class List implements Initializable {
    public ListView lsView= new ListView();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{
            //ket noi void driver
            Class.forName("com.mysql.jdbc.Driver");
            //tao url cho database
            String url="jdbc:mysql://localhost:3306/T1907m";
            String username="root";
            String password="";
            //ket noi voi database
            Connection conn=DriverManager.getConnection(url,username,password);
            //truy cap co so du lieu
            Statement stm=conn.createStatement();
            String sql_text="select * from students";
            ResultSet rs=stm.executeQuery(sql_text);
            ObservableList ls= FXCollections.observableArrayList();
            while(rs.next()){
                Student st= new Student(rs.getString("name"),rs.getInt("age"),rs.getInt("mark"));
                ls.add(st);
            }
            lsView.setItems(ls);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void form(){
        try{
            Parent form= FXMLLoader.load(getClass().getResource("form.fxml"));
            Main.mainStage.getScene().setRoot(form);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
