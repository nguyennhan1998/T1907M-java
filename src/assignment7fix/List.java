package assignment7fix;

import connector.Connector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class List implements Initializable {
    public  ListView<Product> lsView = new ListView<>();
    public static ObservableList<Product> listData = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            reloadData();
            lsView.setItems(listData);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void reloadData() throws Exception {
        String sql = "select * from products";
        Connector connector = Connector.getInstance();
        ResultSet rs = connector.getQuery(sql);
        ObservableList<Product> ls = FXCollections.observableArrayList();
        while (rs.next()) {
            ls.add(new Product(rs.getInt("id"), rs.getString("name"), rs.getString("description"), rs.getDouble("price"), rs.getInt("quantity")));

        }
        listData=ls;
    }

    public void form() {
        try {
            if (Main.formPage == null) {
                Main.formPage = FXMLLoader.load(getClass().getResource("form.fxml"));
            }
            Main.productStage.getScene().setRoot(Main.formPage);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void addToCart() {
        Product selected = lsView.getSelectionModel().getSelectedItem();
        Main.cart.add(selected);
        System.out.println("add an item successfully");

    }

    public void cart() {
        try {
            Parent cart = FXMLLoader.load(getClass().getResource("cart.fxml"));
            Main.productStage.getScene().setRoot(cart);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
