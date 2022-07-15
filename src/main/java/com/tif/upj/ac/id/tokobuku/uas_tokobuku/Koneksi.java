package com.tif.upj.ac.id.tokobuku.uas_tokobuku;

import java.sql.*;

public class Koneksi {

    private Connection conn;
    private Statement st;

    // Sebuah Method yang berfungsi untuk menghubungkan database dengan port 3306
    public Koneksi() {
        try {
            String user = "root";
            String password = "root";
            String urldb = "jdbc:mysql://localhost:3306/project-uas";
            conn = DriverManager.getConnection(urldb,user,password);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
            System.out.println("Koneksi Gagal: " + e);
        }
        catch (Exception e) {
            System.out.println("Terjadi error yang tidak diketahui!" + e);
        }
    }

    //Method utk Insert, Delete, Update
    public int manipulasiData(String query) {
        try {
            st = conn.createStatement();
            return st.executeUpdate(query);
        }
        catch (SQLException e) {
            System.out.println("SQL Error: " +e);
        }
        catch (Exception e) {
            System.out.println("Terjadi Error Yang Tidak Diketahui");
        }
        return 0;
    }
    // Method untuk mengambil Data dari database
    public ResultSet getData (String query) {
        try{
            st = conn.createStatement();
            return st.executeQuery(query);
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}