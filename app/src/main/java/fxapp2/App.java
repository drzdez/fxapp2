package fxapp2;

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
import javafx.scene.web.HTMLEditor;

// import javafx.scene.layout.StackPane;
// import javafx.scene.layout.GridPane;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("--- vvv ---");
//        System.out.println(HelloFX.class.getResource("/myzapp1/testscr1.fxml"));
        System.out.println(App.class.getResource("Edit.fxml"));
        System.out.println("--- ^^^ ---");


        // String javaVersion = System.getProperty("java.version");
        // String javafxVersion = System.getProperty("javafx.version");
        // Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        // Scene scene = new Scene(new StackPane(l), 640, 480);

         // AnchorPane page = (AnchorPane) FXMLLoader.load(HelloFX.class.getResource("testscr1.fxml"));
         AnchorPane page = (AnchorPane) FXMLLoader.load(App.class.getResource("Edit.fxml"));
         Scene scene = new Scene(page);
         stage.setScene(scene);
         stage.show();
         
    }


    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        // System.out.println(new App().getGreeting());
        launch();
    }

}
