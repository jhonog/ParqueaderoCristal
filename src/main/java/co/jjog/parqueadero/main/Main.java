package co.jjog.parqueadero.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

<<<<<<< HEAD
        Parent root = FXMLLoader.load(getClass().getResource("/view/inicio.fxml"));
        Scene scene = new Scene(root);

=======
        Parent root = FXMLLoader.load(getClass().getResource("/src/main/resources/view/"));
        Scene scene = new Scene(root);
>>>>>>> BaseDatos
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main (String[] args){
        launch(args);
    }
}
