module org.example.sgmms_game {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.sgmms_game to javafx.fxml;
    exports org.example.sgmms_game;
}