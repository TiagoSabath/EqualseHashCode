module com.example.equalsehashcode {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.equalsehashcode to javafx.fxml;
    exports com.example.equalsehashcode;
}