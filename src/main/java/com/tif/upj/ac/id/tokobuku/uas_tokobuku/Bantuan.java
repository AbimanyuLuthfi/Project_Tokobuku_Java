package com.tif.upj.ac.id.tokobuku.uas_tokobuku;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Bantuan {
    @FXML
    private Button Button_Back;

    // Sebuah Method yang digunakan jika admin menekan button Back pada tampilan menu bantuan pertama
    // Program akan mengarahkan admin pada tampilan menu utama (Home)
    public void Button_Back_OnClick(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("view-awal.fxml"));

        Stage window = (Stage) Button_Back.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    // Sebuah Method yang digunakan jika admin menekan button Next pada tampilan menu bantuan pertama
    // Program akan mengarahkan admin pada tampilan menu bantuan kedua
    public void ButtnoNextOnClick(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("bantuan2.fxml"));

        Stage window = (Stage) Button_Back.getScene().getWindow();
        window.setScene(new Scene(root));
    }
}
