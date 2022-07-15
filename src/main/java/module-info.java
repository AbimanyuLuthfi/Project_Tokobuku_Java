module com.tif.upj.ac.id.tokobuku.uas_tokobuku {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.tif.upj.ac.id.tokobuku.uas_tokobuku to javafx.fxml;
    exports com.tif.upj.ac.id.tokobuku.uas_tokobuku;
}