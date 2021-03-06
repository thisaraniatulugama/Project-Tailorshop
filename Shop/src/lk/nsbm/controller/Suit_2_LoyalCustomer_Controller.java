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
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import lk.nsbm.bo.impl.CustomerBoImpl;
import lk.nsbm.dto.CustomerDTO;
import lk.nsbm.table.tblCustomers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Suit_2_LoyalCustomer_Controller implements Initializable {

    @FXML
    private TableView<lk.nsbm.table.tblCustomers> tblCustomers;

    @FXML
    private TextField txtFname;

    @FXML
    private TextField txtLname;

    @FXML
    private TextField txtContact;

    @FXML
    private TextField txtID;


    @FXML
    private TextField txtSearch;

    @FXML
    private JFXButton btnSearch;


    @FXML
    private JFXButton btnNext;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadTableData();
        loadData();
    }

    private void loadData() {
        ObservableList<lk.nsbm.table.tblCustomers> data= FXCollections.observableArrayList(new CustomerBoImpl().getAllCustomers());
        tblCustomers.setItems(data);
    }

    private void loadTableData() {
        tblCustomers.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("customerid"));
        tblCustomers.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("fname"));
        tblCustomers.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("lname"));
        tblCustomers.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("contact"));
    }

    @FXML
    void loadMeasurementWindow(ActionEvent event) throws IOException {
        loadWindow("/lk/nsbm/view/Suit_3_Measurements.fxml",event);
    }

    public void loadWindow(String path,ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource(path));
        Scene scene=new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setX(550);
        stage.setY(100);
        stage.show();
    }

    @FXML
    void loadDetailsToFields(MouseEvent event) {
        txtID.setText(tblCustomers.getSelectionModel().getSelectedItem().getCustomerid());
        txtFname.setText(tblCustomers.getSelectionModel().getSelectedItem().getFname());
        txtLname.setText(tblCustomers.getSelectionModel().getSelectedItem().getLname());
        txtContact.setText(tblCustomers.getSelectionModel().getSelectedItem().getContact());
    }

    @FXML
    void searchCustomer(ActionEvent event) {
        ObservableList<lk.nsbm.table.tblCustomers> data= FXCollections.observableArrayList(new CustomerBoImpl().searchCustomer(txtSearch.getText()));
        tblCustomers.setItems(data);
    }

    @FXML
    void getAllCustomers(ActionEvent event) {
        loadData();
        txtSearch.clear();
    }
}


