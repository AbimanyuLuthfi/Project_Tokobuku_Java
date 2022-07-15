package com.tif.upj.ac.id.tokobuku.uas_tokobuku;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


import java.io.IOException;

public class ControllerUtama {

    public Button ButtonLogout;
    @FXML
    private Button Button_Exit;
    @FXML
    private Button Modifikasi_List;
    @FXML
    private Button Bantuan;
    @FXML
    private Button Tentang_Kami;
    @FXML
    private Stage stage;

    // Sebuah Method yang digunakan jika admin menekan button Modifikasi List pada tampilan menu utama (Home)
    // Program akan mengarahkan admin pada tampilan menu Modifikasi List
    public void Modifikasi_List_OnClick(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        Stage window = (Stage) Modifikasi_List.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    // Sebuah Method yang digunakan jika admin menekan button Bantuan pada tampilan menu utama (Home)
    // Program akan mengarahkan admin pada tampilan menu Bantuan
    public void Bantuan_OnClick(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("bantuan.fxml"));

        Stage window = (Stage) Bantuan.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    // Sebuah Method yang digunakan jika admin menekan button Tentang Kami pada tampilan menu utama (Home)
    // Program akan mengarahkan admin pada tampilan menu Tentang Kami
    public void Tentang_Kami_OnClick(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("tentang-kami.fxml"));

        Stage window = (Stage) Tentang_Kami.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    // Sebuah Method yang digunakan jika admin menekan button Exit pada tampilan menu utama (Home)
    // Program akan mengarahkan admin pada menu Exit
    // Menu Exit terdiri dari 2 Button (OK dan Cancel)
    public void Button_Exit_OnClick(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("exit.fxml"));

        Stage window = (Stage) Button_Exit.getScene().getWindow();
        window.setScene(new Scene(root));

    }

    // Sebuah Method yang digunakan jika admin menekan button Logout pada tampilan menu utama (Home)
    // Program akan mengarahkan admin pada tampilan menu Logout, yang terdiri dari 2 Button (OK dan Cancel)
    // Jika Button ok ditekan maka program akan mengarahkan admin pada tampilan menu login

    public void ButtonLogoutOnClick(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("logout-warning.fxml"));

        Stage window = (Stage) Button_Exit.getScene().getWindow();
        window.setScene(new Scene(root));
    }
}
