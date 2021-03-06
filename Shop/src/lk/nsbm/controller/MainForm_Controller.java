package lk.nsbm.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class MainForm_Controller implements Initializable {

    @FXML
    private JFXButton btnsuit;

    @FXML
    private JFXButton btnproduct;

    @FXML
    private JFXButton btnMaterial;

    @FXML
    private JFXButton btntailor;

    @FXML
    private JFXButton btnrenting;

    @FXML
    private JFXButton btncustomer;

    @FXML
    private JFXButton btnsummary;

    @FXML
    private Label lblDay;

    @FXML
    private Label lblDayNo;

    @FXML
    private Label lblYearNo;

    @FXML
    private Label lblMonthNo;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String[] date= String.valueOf(LocalDate.now()).split("-");
        String day=LocalDate.now().getDayOfWeek().name();
        lblDay.setText(day);
        lblDayNo.setText(date[2]);
        lblMonthNo.setText(date[1]);
        lblYearNo.setText(date[0]);

    }


    @FXML
    void loadCustomerWindow(ActionEvent event) throws IOException {
        loadWindow("/lk/nsbm/view/Customer_1.fxml","Customer Window");
    }

    @FXML
    void loadProductWindow(ActionEvent event) throws IOException {
        loadWindow("/lk/nsbm/view/Product_1.fxml","Products Window");
    }

    @FXML
    void loadRentingWindow(ActionEvent event) throws IOException {
        loadWindow("/lk/nsbm/view/Renting_1.fxml","Coat Renting Window");
    }

    @FXML
    void loadSuitWindow(ActionEvent event) throws IOException {
        loadWindow("/lk/nsbm/view/Suit_1.fxml","Suit Window");
    }

    @FXML
    void loadSummaryWindow(ActionEvent event) throws IOException {
        loadWindow("/lk/nsbm/view/Summary_1.fxml","Summary Window");
    }

    @FXML
    void loadTailorWindow(ActionEvent event) throws IOException {
        loadWindow("/lk/nsbm/view/Tailor_1.fxml","Tailor Window");


    }

    @FXML
    void loadMaterialWindow(ActionEvent event) throws IOException {
        loadWindow("/lk/nsbm/view/Material_1_ManageMaterial.fxml","Material Window");
    }

    public void loadWindow(String path,String title) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource(path));
        Scene scene=new Scene(root);
        Stage stage=new Stage();
        stage.setTitle(title);
        stage.setScene(scene);
        stage.setX(570);
        stage.setY(400);

        stage.setResizable(false);
        stage.show();
    }


}
