package sample;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    Button button_1;
    @FXML
    Button button_2;
    @FXML
    Button button_3;
    @FXML
    Button button_4;
    @FXML
    Button button_5;

    public int nums[] = {1,2,3,4,5};
    public int numSiguiente = 1;
    Stage stage;
    Scene scene;
    Parent root;

    public void onClickRight(Event event) throws IOException {
        Button button = (Button) event.getSource();
//        System.out.println(button.getText());
        if(Integer.parseInt(button.getText()) == numSiguiente && numSiguiente < 5){
            numSiguiente++;
            System.out.println(numSiguiente);
        }else if(numSiguiente >= 5){
            System.out.println("he entrado al menos");
            stage = (Stage) button.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("nuevaEscena.fxml"));
            Scene nueva = new Scene(root);
            stage.setScene(nueva);
            stage.show();
        }else{
            System.out.println("pruebecita");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        int numAsignar = 0;
        button_1.setText(String.valueOf(1));

    }
}
