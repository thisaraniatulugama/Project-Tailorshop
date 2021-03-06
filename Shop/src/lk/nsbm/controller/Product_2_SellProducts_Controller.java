package lk.nsbm.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Product_2_SellProducts_Controller implements Initializable {

    @FXML
    private JFXButton btnDone;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    void closeProductWindow(ActionEvent event) {
        closeWindow(event);
    }

    public void closeWindow(ActionEvent event){
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        stage.close();
    }
}
