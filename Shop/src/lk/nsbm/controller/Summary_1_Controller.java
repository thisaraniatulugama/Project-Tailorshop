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

public class Summary_1_Controller implements Initializable {

    @FXML
    private JFXButton btnExpense;

    @FXML
    private JFXButton btnAnnualReport;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    void loadAnnualReportWindow(ActionEvent event) throws IOException {
        loadWindow("/lk/nsbm/view/Summary_2_Report.fxml",event);
    }

    @FXML
    void loadExpenseWindow(ActionEvent event) throws IOException {
        loadWindow("/lk/nsbm/view/Summary_2_Expenses.fxml",event);
    }

    public void loadWindow(String path,ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource(path));
        Scene scene=new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
