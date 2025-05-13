package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage firstStage) throws Exception{
        // 📢📢 Cambiar ruta con el diseño de Inicio (Por Hacer)
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/org/RegistroDeEstudiante.fxml")));
        Scene scene = new Scene(root);
        firstStage.setTitle("Inicio");
        firstStage.setScene(scene);
        firstStage.show();
    }
}
