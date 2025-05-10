package org.example.restaurantevirtual;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(    HelloApplication.class.getResource(
                "/org/example/restaurantevirtual/view/restaurante.fxml"
        ));
        Scene scene = new Scene(fxmlLoader.load(), 630, 450);
        stage.setTitle("Restaurante Virtual");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}