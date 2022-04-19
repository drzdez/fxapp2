package myzapp1;

/*
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
*/

// Added
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;

public class HelloFX extends Application {

    @Override
    public void start(Stage stage) throws Exception {


        System.out.println("--- vvv ---");
//        System.out.println(HelloFX.class.getResource("/myzapp1/testscr1.fxml"));
        System.out.println(HelloFX.class.getResource("testscr1.fxml"));
        System.out.println("--- ^^^ ---");


        // String javaVersion = System.getProperty("java.version");
        // String javafxVersion = System.getProperty("javafx.version");
        // Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        // Scene scene = new Scene(new StackPane(l), 640, 480);

         // AnchorPane page = (AnchorPane) FXMLLoader.load(HelloFX.class.getResource("testscr1.fxml"));
         GridPane page = (GridPane) FXMLLoader.load(HelloFX.class.getResource("testscr1.fxml"));
         Scene scene = new Scene(page);
         stage.setScene(scene);
         stage.show();
         
    }


/*
    @Override
    public void start(Stage stage) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Scene scene = new Scene(new StackPane(l), 640, 480);
        stage.setScene(scene);
        stage.show();
    }
*/

    public static void main(String[] args) {
        launch();
    }

}

