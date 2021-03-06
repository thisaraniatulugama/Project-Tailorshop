package lk.nsbm.main;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lk.nsbm.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Startup extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root= FXMLLoader.load(Startup.class.getResource("/lk/nsbm/view/Login.fxml"));
        Scene scene=new Scene(root);
        primaryStage.setTitle("Tailor Shop");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    public static void main(String[] args) {
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();

        launch(args);

        session.close();
        sessionFactory.close();

    }
}
