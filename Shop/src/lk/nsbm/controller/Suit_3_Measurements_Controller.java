package lk.nsbm.controller;

import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lk.nsbm.bo.impl.OrdersBoImpl;
import lk.nsbm.bo.impl.SuitsBoImpl;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Suit_3_Measurements_Controller implements Initializable {

    @FXML
    private JFXButton btnNext;

    @FXML
    private TextField txtOrderID;

    @FXML
    private TextField txtSuitID;

    @FXML
    private ComboBox<String> comboSuits;

    @FXML
    private ComboBox<String> comboMaterial;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtOrderID.setText(new OrdersBoImpl().getLastOrderID());
        txtSuitID.setText(new SuitsBoImpl().getLastSuitID());
        loadSuitTypes();
        loadMaterial();
    }

    private void loadMaterial() {

    }

    private void loadSuitTypes() {

    }

    @FXML
    void loadPaymentWindow(ActionEvent event) throws IOException {
        loadWindow("/lk/nsbm/view/Suit_4_Payment.fxml",event);
    }

    public void loadWindow(String path,ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource(path));
        Scene scene=new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

}
