package com.tif.upj.ac.id.tokobuku.uas_tokobuku;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Bantuan2 {
    public Button Button_Back;

    // Sebuah Method yang digunakan jika admin menekan button Back pada tampilan menu bantuan kedua
    // Program akan mengarahkan admin pada tampilan menu bantuan kedua
    public void Button_Back_OnClick(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("bantuan.fxml"));

        Stage window = (Stage) Button_Back.getScene().getWindow();
        window.setScene(new Scene(root));
    }
}
