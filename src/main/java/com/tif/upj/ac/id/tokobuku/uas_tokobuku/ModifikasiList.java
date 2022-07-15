package com.tif.upj.ac.id.tokobuku.uas_tokobuku;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleFloatProperty;


import java.io.IOException;
import java.sql.ResultSet;

import java.net.URL;
import java.util.ResourceBundle;

public class ModifikasiList implements Initializable {

    public TableView<ModelAplikasi> tableData;
    public TableColumn<ModelAplikasi, SimpleIntegerProperty> colId;
    public TableColumn<ModelAplikasi, SimpleStringProperty> colJenis_Buku;
    public TableColumn<ModelAplikasi, SimpleStringProperty> colNama_Buku;
    public TableColumn<ModelAplikasi, SimpleIntegerProperty> colStok_Buku;
    public TableColumn<ModelAplikasi, SimpleFloatProperty> colHarga_Buku;


    @FXML
    private TextField txtId;

    @FXML
    private TextField Jenis_Buku;

    @FXML
    private TextField Nama_Buku;

    @FXML
    private TextField Stok_Buku;

    @FXML
    private TextField Harga_Buku;

    @FXML
    private Label List;

    @FXML
    private Button Button_Back;

    @FXML
    private Button Simpan;

    @FXML
    private Button View;

    @FXML
    private Button Update;

    @FXML
    private Koneksi koneksi = new Koneksi();

//    public HelloController(int id, String jenbuk, String nambuk, int stokbuk, float harbuk) {
//    }
    // Sebuah method untuk menginisiasi dengan parameter URL dan resourceBundle
    public void initialize (URL url, ResourceBundle resourceBundle) {
        this.tampilDataTableView();
    }

    /* Sebuah method yang berfungsi untuk membuat model dengan implementasi dari class ModelAplikasi.
    Parameter pada method ini yaitu dengan membuat object melalui class Model Aplikasi
     */
    private void showModel (ModelAplikasi model) {
        if (model != null) {
            txtId.setText(model.idProperty().getValue().toString());
            Jenis_Buku.setText(model.getJenisBuku());
            Nama_Buku.setText(model.getNamaBuku());
            Stok_Buku.setText(String.valueOf(model.getStokBuku()));
            Harga_Buku.setText(String.valueOf(model.getHargaBuku()));
        }
        else {
            txtId.setText("");
            Jenis_Buku.setText("");
            Nama_Buku.setText("");
            Stok_Buku.setText("");
            Harga_Buku.setText("");
        }
    }

    // Sebuah Method yang digunakan jika admin menekan button Save pada tampilan menu Modifikasi List
    // Program akan secara otomatis menyimpan data pada database
    public void SimpanOnClick(ActionEvent actionEvent) {
        String teksid = txtId.getText();
        String teks = Jenis_Buku.getText();
        String teks1 = Nama_Buku.getText();
        String stock = Stok_Buku.getText();
        String bayar = Harga_Buku.getText();
        List.setText(teks + "\n" + teks1 + "\n" + stock + "\n" + bayar);
        if(!teks.isEmpty() && teksid.isEmpty()){
            String query = "INSERT INTO tokobuku (JenisBuku,NamaBuku,StokBuku,HargaBuku) VALUES('"+teks+"','"+teks1+"','"+stock+"','"+bayar+"')";
            int hasil = koneksi.manipulasiData(query);
            if (hasil == 1){
                System.out.println("Data berhasil diinput");
//                this.tampilDataTableView();
            }
        }
    }

    // Sebuah Method yang digunakan jika admin menekan button Reset pada tampilan menu Modifikasi List
    // Program akan secara mengosongkan textfield pada label Jenis Buku, Nama Buku, Stok Buku dan Harga Buku
    public void ResetOnClick(ActionEvent actionEvent) {
        txtId.setText("");
        Jenis_Buku.setText("");
        Nama_Buku.setText("");
        Stok_Buku.setText("");
        Harga_Buku.setText("");
        List.setText("");
    }

    // Sebuah Method yang digunakan jika admin menekan button Update pada tampilan menu Modifikasi List
    // Program akan secara otomatis memperbarui dan menyimpan data terbaru pada database
    public void UpdateOnClick(ActionEvent actionEvent) {
        String teksid = txtId.getText();
        String teks = Jenis_Buku.getText();
        String teks1 = Nama_Buku.getText();
        String stock = Stok_Buku.getText();
        String bayar = Harga_Buku.getText();
        if (!teksid.isEmpty()) {
            String query = "UPDATE tokobuku SET JenisBuku='"+teks+"',NamaBuku='"+teks1+"',StokBuku='"+stock+"',HargaBuku='"+bayar+"' WHERE id=" + Integer.parseInt(teksid);
            int hasil = koneksi.manipulasiData(query);
            if (hasil == 1){
                System.out.println("Data berhasil diedit");
                this.tampilDataTableView();
            }

        }
    }

    // Sebuah Method yang digunakan jika admin menekan button Delete pada tampilan menu Modifikasi List
    // Program akan secara otomatis menghapus data yang dipilih pada database
    public void DeleteOnClick(ActionEvent actionEvent) {
        String teksId = txtId.getText();
        if (!teksId.isEmpty()) {
            String query = "DELETE FROM tokobuku WHERE id=" + Integer.parseInt(teksId);
            int hasil = koneksi.manipulasiData(query);
            if (hasil == 1){
                System.out.println("Data berhasil dihapus");
                this.tampilDataTableView();
            }
        }
    }

    /* Sebuah Method yang digunakan untuk menampilkan data yang tersimpan pada database dengan
    variable yang sesuai dengan database.
     */
    private void tampilDataTableView() {
        colId.setCellValueFactory(new PropertyValueFactory<>("Id"));
        colJenis_Buku.setCellValueFactory(new PropertyValueFactory<>("JenisBuku"));
        colNama_Buku.setCellValueFactory(new PropertyValueFactory<>("NamaBuku"));
        colStok_Buku.setCellValueFactory(new PropertyValueFactory<>("StokBuku"));
        colHarga_Buku.setCellValueFactory(new PropertyValueFactory<>("HargaBuku"));
            try{
                String query = "SELECT * FROM tokobuku";
                ResultSet hasil = koneksi.getData(query);
                ObservableList<ModelAplikasi> modelAplikasi = FXCollections.observableArrayList();
                tableData.setItems(modelAplikasi);
                while (hasil.next()){
                    int id = hasil.getInt (1);
                    String Jenbuk = hasil.getString (2);
                    String Nambuk = hasil.getString (3);
                    int Stokbuk = hasil.getInt (4);
                    float Harbuk = hasil.getFloat (5);
                    modelAplikasi.add(new ModelAplikasi(id, Jenbuk, Nambuk, Stokbuk, Harbuk));
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            tableData.getSelectionModel().selectedItemProperty().addListener(
                    (observable, oldValue, newValue) -> showModel(newValue));
    }

    // Sebuah Method yang digunakan jika admin menekan button View pada tampilan menu Modifikasi List
    // Program akan secara otomatis menampilkan data yang tersimpan pada database di dalam table view
    // Method ini juga memanggil method tampilDataTableView untuk menampilkan data yang tersimpan pada database
    public void View_OnClick() {
        tampilDataTableView();
        System.out.println("bisa");
    }

    // Sebuah Method yang digunakan jika admin menekan button Back pada tampilan menu Modifikasi List
    // Program akan mengarahkan admin pada tampilan menu utama (Home)
    public void Button_Back_OnClick(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("view-awal.fxml"));

        Stage window = (Stage) Button_Back.getScene().getWindow();
        window.setScene(new Scene(root));
    }


}