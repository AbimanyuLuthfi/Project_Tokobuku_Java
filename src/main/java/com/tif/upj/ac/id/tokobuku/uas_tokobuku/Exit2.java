package com.tif.upj.ac.id.tokobuku.uas_tokobuku;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Exit2 {

    public Button Button_Ok;
    @FXML
    private Button Button_Cancel;
    @FXML
    private Stage stage;
    public Pane tampilan_exit;

    // Sebuah method yang berrfungsi jika admin menekan  button Ok pada tampilan menu Exit pertama
    // Program akan berakhir jika admin menekannya
    public void Button_Ok_OnClick(ActionEvent actionEvent) {
        this.stage = (Stage) tampilan_exit.getScene().getWindow();
        System.out.println("Berhasil keluar");
        this.stage.close();
    }

    // Sebuah method yang berrfungsi jika admin menekan  button Cancel pada tampilan menu Exit pertama
    // Program akan Kembali pada tampilan menu utama (Home) jika button tersebut ditekan oleh admin
    public void Button_Cancel_OnClick(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("view-awal.fxml"));

        Stage window = (Stage) Button_Cancel.getScene().getWindow();
        window.setScene(new Scene(root));
    }
}
