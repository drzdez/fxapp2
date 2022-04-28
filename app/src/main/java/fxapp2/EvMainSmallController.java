package fxapp2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import javafx.stage.FileChooser;
import java.io.File;
import java.io.IOException;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

// app specific
import com.evocodsys.xml.XMLWrapperDOM;

public class EvMainSmallController  {
    // public void handleButtonAction(ActionEvent event) {

     Stage stage = null;

     public void setStage(Stage aStage) {
         this.stage = aStage;
     }


     public void onMenuFileOpen() throws Exception{
         System.out.println("You clicked open !");

         final FileChooser fileChooser = new FileChooser();
         File file = fileChooser.showOpenDialog(stage);

         if (file != null) {
             // openFile(file);
             System.out.println("Picked file: " + file.getName());
         
             XMLWrapperDOM lMyDoc = new XMLWrapperDOM(file);
             lMyDoc.readNode();
         }
     }

}
