/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymangment;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ameer ~
 */
public class MangmentsController implements Initializable {

    @FXML
    private Button BooksMangment;
    @FXML
    private Button BorrowerMangment;
    @FXML
    private Button BorroweBookMang;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void BooksMangmentHandle(ActionEvent event) throws Exception {
            Stage stage = new Stage(); 
            BooksStage(stage);
    }

    @FXML
    private void BorrowerMangmentHandle(ActionEvent event) throws Exception {
        
         Stage stage = new Stage();
        BorrowerStage(stage);
    }

    @FXML
    private void BorroweBookMangHandle(ActionEvent event) throws Exception {
        Stage stage = new Stage();
        BorrowerBooksStage(stage);
    }
    
    
    public void BooksStage(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("BooksInterFace.fxml"));
        
        stage.setTitle("Books Mangment");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void BorrowerStage(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("BorrowersInterFace.fxml"));
        stage.setTitle("Borrowers Mangment");
        stage.setScene(new Scene(root));
        stage.show();
    }
     public void BorrowerBooksStage(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("BorrowerBooksInterFace.fxml"));
        stage.setTitle("Borrowers Mangment");
        stage.setScene(new Scene(root));
        stage.show();
    }

   
    
}
