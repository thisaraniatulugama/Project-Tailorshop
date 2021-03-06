package lk.nsbm.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Suit_1_Controller implements Initializable {

    @FXML
    private JFXButton btnNewCustomer;

    @FXML
    private JFXButton btnLoyalCustomer;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    void loadLoyalCustomerWindow(ActionEvent event) throws IOException {
       loadWindow(event,"/lk/nsbm/view/Suit_2_LoyalCustomer.fxml");
    }

    @FXML
    void loadNewCustomerWindow(ActionEvent event) throws IOException {
        loadWindow(event,"/lk/nsbm/view/Suit_2_NewCustomer.fxml");
    }

    public void loadWindow(ActionEvent event,String path) throws IOException {
        Parent window= FXMLLoader.load(getClass().getResource(path));
        Scene scene=new Scene(window);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setX(530);
        stage.setY(150);
        stage.show();
    }
}
