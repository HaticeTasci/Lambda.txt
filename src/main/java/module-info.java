module com.example.techpro2020 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.techpro2020 to javafx.fxml;
    exports com.example.techpro2020;
}