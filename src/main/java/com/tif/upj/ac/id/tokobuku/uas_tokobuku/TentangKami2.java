package com.tif.upj.ac.id.tokobuku.uas_tokobuku;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class TentangKami2 {
    public Button Button_Back;

    // Sebuah Method yang digunakan jika admin menekan button Back pada tampilan menu Tentang Kami kedua
    // Program akan secara mengarahkan admin pada menu tampilan Tentang Kami pertama
    public void Button_Back_OnClick(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("tentang-kami.fxml"));

        Stage window = (Stage) Button_Back.getScene().getWindow();
        window.setScene(new Scene(root));
    }
}
