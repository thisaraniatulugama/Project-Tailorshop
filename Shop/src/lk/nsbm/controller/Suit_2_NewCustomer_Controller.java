package lk.nsbm.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lk.nsbm.bo.CustomerBo;
import lk.nsbm.bo.impl.CustomerBoImpl;
import lk.nsbm.dto.CustomerDTO;
import lk.nsbm.entity.Customer;
import lk.nsbm.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Suit_2_NewCustomer_Controller implements Initializable {

    @FXML
    private JFXTextField txtFname;

    @FXML
    private JFXTextField txtLname;

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private JFXTextField txtContact;

    @FXML
    private JFXTextField txtNIC;

    @FXML
    private JFXTextField txtCustomerID;

    @FXML
    private JFXButton btnClear;

    @FXML
    private JFXButton btnNext;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtCustomerID.setText(new CustomerBoImpl().getLastCustomerid());
    }

    @FXML
    void clearAll(ActionEvent event) {
        txtFname.clear();
        txtLname.clear();
        txtContact.clear();
        txtNIC.clear();
        txtAddress.clear();

    }

    @FXML
    void loadMeasurementWindow(ActionEvent event) throws IOException {
        new CustomerBoImpl().addCustomer(new CustomerDTO(txtCustomerID.getText(),txtFname.getText(),txtLname.getText(),txtAddress.getText(),txtContact.getText(),
                txtNIC.getText()));
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


}
