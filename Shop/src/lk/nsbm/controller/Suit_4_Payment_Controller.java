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

public class Suit_4_Payment_Controller implements Initializable {

    @FXML
    private JFXButton btnDone;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    void closePaymentWindow(ActionEvent event) throws IOException {
        closeWindow(event);
    }

    public void closeWindow(ActionEvent event) throws IOException {
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        stage.close();
    }
}
