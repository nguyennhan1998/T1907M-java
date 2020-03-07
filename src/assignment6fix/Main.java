package assignment6fix;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    public static Stage productStage;
    public static ObservableList<Product> cart= FXCollections.observableArrayList();

    @Override
    public void start(Stage primaryStage) {
        productStage=primaryStage;
        try{
            Parent root= FXMLLoader.load(getClass().getResource("listproduct.fxml"));
            primaryStage.setTitle("manage products");
            primaryStage.setScene(new Scene(root,600,400));
            primaryStage.show();



        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
