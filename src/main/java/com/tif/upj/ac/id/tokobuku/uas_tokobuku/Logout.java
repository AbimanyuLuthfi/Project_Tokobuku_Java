package com.tif.upj.ac.id.tokobuku.uas_tokobuku;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Logout {
    public Button Button_Ok;
    public Button Button_Cancel;

    // Sebuah method yang berrfungsi jika admin menekan  button Ok pada tampilan menu Exit pertama
    // Program akan berakhir jika admin menekannya
    public void Button_Ok_OnClick(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));

        Stage window = (Stage) Button_Cancel.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    // Sebuah method yang berrfungsi jika admin menekan  button Cancel pada tampilan menu Exit pertama
    // Program akan Kembali pada tampilan menu utama (Home) jika button tersebut ditekan oleh admin
    public void Button_Cancel_OnClick(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("view-awal.fxml"));

        Stage window = (Stage) Button_Cancel.getScene().getWindow();
        window.setScene(new Scene(root));
    }
}
