package assignment7fix;

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
    public static  Parent listPage;
    public static Parent formPage;
    @Override
    public void start(Stage primaryStage) {
        productStage=primaryStage;
        try{
            if(listPage==null){
                Parent root= FXMLLoader.load(getClass().getResource("list.fxml"));
                listPage=root;
            }

            primaryStage.setTitle("nhap thong tin san pham");
            primaryStage.setScene(new Scene(listPage,800,600));
            primaryStage.show();

        }catch (Exception e){
            e.getMessage();
        }

    }
}
