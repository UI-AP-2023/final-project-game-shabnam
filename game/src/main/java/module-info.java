module com.example.game {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    opens com.example.game to javafx.fxml;
    exports com.example.game;
}