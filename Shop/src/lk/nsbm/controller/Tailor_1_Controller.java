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

public class Tailor_1_Controller implements Initializable {


    @FXML
    private JFXButton btnWorkorder;

    @FXML
    private JFXButton btnManageTailor;

    @FXML
    private JFXButton btnPayment;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    void loadManageTailorWindow(ActionEvent event) throws IOException {
        loadWindow("/lk/nsbm/view/Tailor_2_ManageTailor.fxml",event);
    }

    @FXML
    void loadTailorPaymentWindow(ActionEvent event) throws IOException {
        loadWindow("/lk/nsbm/view/Tailor_2_Payments.fxml",event);
    }

    @FXML
    void loadWorkorderWindow(ActionEvent event) throws IOException {
        loadWindow("/lk/nsbm/view/Tailor_2_WorkOrder.fxml",event);
    }

    public void loadWindow(String path,ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource(path));
        Scene scene=new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }
}
