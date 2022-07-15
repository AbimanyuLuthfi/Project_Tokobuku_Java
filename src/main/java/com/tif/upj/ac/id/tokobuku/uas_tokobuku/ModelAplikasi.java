package com.tif.upj.ac.id.tokobuku.uas_tokobuku;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleFloatProperty;


public class ModelAplikasi {
    // Membuat variable dam property sesuai dengan kebutuhan aplikasi dengan modifier private
    // Penamaannya harus sesuai dengan database
    private IntegerProperty id;
    private StringProperty JenisBuku;
    private StringProperty NamaBuku;
    private IntegerProperty StokBuku;
    private FloatProperty HargaBuku;

    /* Setelah variable dan property selesai dibuat, method dibawah ini berfungsi membuat setter getter
    beserta dengan property sesuai dengan tipe data masing - masing variable
     */
    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getJenisBuku() {
        return JenisBuku.get();
    }

    public StringProperty jenbukProperty() {
        return JenisBuku;
    }

    public void setJenisBuku(String jenbuk) {
        this.JenisBuku.set(jenbuk);
    }

    public String getNamaBuku() {
        return NamaBuku.get();
    }

    public StringProperty nambukProperty() {
        return NamaBuku;
    }

    public void setNamaBuku(String nambuk) {
        this.NamaBuku.set(nambuk);
    }

    public int getStokBuku() {
        return StokBuku.get();
    }

    public IntegerProperty stokbukProperty() {
        return StokBuku;
    }

    public void setStokBuku(int stokbuk) {
        this.StokBuku.set(stokbuk);
    }

    public float getHargaBuku() {
        return HargaBuku.get();
    }

    public FloatProperty harbukProperty() {

        return HargaBuku;
    }

    public void setHargaBuku(float harbuk) {

        this.HargaBuku.set(harbuk);
    }

    public ModelAplikasi (int id, String JenisBuku, String NamaBuku, int StokBuku, float HargaBuku) {
        this.id = new SimpleIntegerProperty(id);
        this.JenisBuku = new SimpleStringProperty(JenisBuku);
        this.NamaBuku =  new SimpleStringProperty(NamaBuku);
        this.StokBuku = new SimpleIntegerProperty(StokBuku);
        this.HargaBuku = new SimpleFloatProperty(HargaBuku);
    }
}
