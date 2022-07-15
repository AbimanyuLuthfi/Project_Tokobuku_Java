package com.tif.upj.ac.id.tokobuku.uas_tokobuku;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Login {

    @FXML
    private TextField Username;
    @FXML
    private PasswordField Password;
    @FXML
    private Button Button_Next;
    @FXML
    private Button Button_Exit;

    // Sebuah method yang berrfungsi jika admin menekan  button Next pada tampilan menu Login
    // Program akan mengarahkan admin pada tampilan menu utama (Home)
    // Jika Username tidak berupa "admin" program akan mengembalikannya pada menu login
    // Jika Password tidak berupa "admin" program akan mengembalikannya pada menu login
    public void Button_Next_OnClick(ActionEvent actionEvent) throws IOException {
        String usnm = Username.getText();
        String pass = Password.getText();
        String pass1 = "admin";
        if ((pass.equals(pass1)) && (usnm.equals(pass1))) {
            Parent root = FXMLLoader.load(getClass().getResource("view-awal.fxml"));

            Stage window = (Stage) Button_Next.getScene().getWindow();
            window.setScene(new Scene(root));
        }
        else {
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));

            Stage window = (Stage) Button_Next.getScene().getWindow();
            window.setScene(new Scene(root));
        }
    }

    // Sebuah method yang berrfungsi jika admin menekan  button Exit pada tampilan menu Login
    // Program akan mengarahkan admin pada tampilan menu Exit yang memiliki 2 button (OK dan Cancel)
    public void ButtonExitOnClick(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("exit-login.fxml"));

        Stage window = (Stage) Button_Exit.getScene().getWindow();
        window.setScene(new Scene(root));
    }

}
