module com.example.gamiliapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.gamiliapp to javafx.fxml;
    exports com.example.gamiliapp;
}