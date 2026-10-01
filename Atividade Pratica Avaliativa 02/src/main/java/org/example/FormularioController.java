package org.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class FormularioController {

    @FXML
    private TextField cpfField;

    @FXML
    private TextField nomeField;

    @FXML
    private TextField enderecoField;

    @FXML
    private ComboBox<String> estadoCombo;

    @FXML
    private ComboBox<String> cargoCombo;

    @FXML
    private Button imprimirButton;

    @FXML
    private void initialize() {
        ObservableList<String> estados = FXCollections.observableArrayList(
                "Acre",
                "Alagoas",
                "Amapá",
                "Amazonas",
                "Bahia",
                "Ceará",
                "Distrito Federal",
                "Espírito Santo",
                "Goiás",
                "Maranhão",
                "Mato Grosso",
                "Mato Grosso do Sul",
                "Minas Gerais",
                "Pará",
                "Paraíba",
                "Paraná",
                "Pernambuco",
                "Piauí",
                "Rio de Janeiro",
                "Rio Grande do Norte",
                "Rio Grande do Sul",
                "Rondônia",
                "Roraima",
                "Santa Catarina",
                "São Paulo",
                "Sergipe",
                "Tocantins"
        );

        ObservableList<String> cargos = FXCollections.observableArrayList(
                "Analista",
                "Assistente Administrativo",
                "Desenvolvedor de Software",
                "Gerente de Marketing",
                "Professor"
        );

        estadoCombo.setItems(estados);
        cargoCombo.setItems(cargos);

        // Expressão lambda para tratar o clique no botão
        imprimirButton.setOnAction(event -> imprimirDados());
    }

    private void imprimirDados() {
        String dados = "CPF: " + valor(cpfField.getText())
                + "\nNome: " + valor(nomeField.getText())
                + "\nEndereço: " + valor(enderecoField.getText())
                + "\nEstado: " + valor(estadoCombo.getValue())
                + "\nCargo: " + valor(cargoCombo.getValue());

        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Mensagem");
        alerta.setHeaderText(null);
        alerta.setContentText(dados);
        alerta.showAndWait();
    }

    private String valor(String texto) {
        if (texto == null || texto.isBlank()) {
            return "(não informado)";
        }
        return texto.trim();
    }
}