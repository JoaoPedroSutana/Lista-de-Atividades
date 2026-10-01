package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FormularioFxml extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/org/example/formulario.fxml")
        );

        Scene scene = new Scene(loader.load(), 400, 300);

        scene.getStylesheets().add(
                getClass().getResource("/org/example/formulario.css").toExternalForm()
        );

        scene.getStylesheets().add(
                getClass().getResource("/org/example/formulario.css").toExternalForm()
        );

        stage.setTitle("Formulário para cadastro de Pessoa");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}