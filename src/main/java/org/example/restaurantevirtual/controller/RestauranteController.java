package org.example.restaurantevirtual.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.restaurantevirtual.model.OrderStorage;
import org.example.restaurantevirtual.model.Pedido;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RestauranteController implements Initializable {

    @FXML
    private Button btnConfirm;

    @FXML
    private ComboBox<String> cbBebida;

    @FXML
    private CheckBox cbGelo;

    @FXML
    private Label saida;

    @FXML
    private TextField tfPrato;

    @FXML
    private TextField tfQntd;
    @FXML
    private Button btnVerPedidos;


    @FXML
    void handleConfirmarAction(ActionEvent event) {
        String prato = tfPrato.getText();
        String qtd   = tfQntd.getText();
        String bebida= cbBebida.getValue();
        boolean gelo = cbGelo.isSelected();
        saida.setText(
                "Prato: "+prato+" | Qtd: "+qtd+
                        " | Bebida: "+bebida+
                        (gelo ? " | Com Gelo" : "")
        );
        OrderStorage.getInstance()
                .addOrder(new Pedido(prato, qtd, bebida, gelo));
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cbBebida.getItems().addAll("Refrigerante","Água","Água com gás","Suco");

    }

    @FXML
    private void verPedidos(ActionEvent e) throws IOException {
        // carrega de view/Pedidos.fxml
        URL url = getClass().getResource(
                "/org/example/restaurantevirtual/view/Pedidos.fxml"
        );
        if (url == null) {
            throw new RuntimeException("Não encontrei o Pedidos.fxml em /view!");
        }
        Parent root = FXMLLoader.load(url);
        Stage stage = (Stage) btnVerPedidos.getScene().getWindow();
        stage.setScene(new Scene(root, 500, 400));
        stage.setTitle("Tabela dos pedidos");
    }
}
