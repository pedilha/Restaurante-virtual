package org.example.restaurantevirtual.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.restaurantevirtual.model.OrderStorage;
import org.example.restaurantevirtual.model.Pedido;
import java.io.IOException;

public class PedidosController {
    @FXML private TableView<Pedido> tablePedidos;
    @FXML private TableColumn<Pedido,String> colPrato;
    @FXML private TableColumn<Pedido,String> colQtd;
    @FXML private TableColumn<Pedido,String> colBebida;
    @FXML private TableColumn<Pedido,Boolean> colGelo;

    @FXML
    public void initialize() {
        colPrato.setCellValueFactory(
                new PropertyValueFactory<>("prato")
        );
        colQtd.setCellValueFactory(
                new PropertyValueFactory<>("qtd")
        );
        colBebida.setCellValueFactory(
                new PropertyValueFactory<>("bebida")
        );
        colGelo.setCellValueFactory(
                new PropertyValueFactory<>("gelo")
        );

        // Preenche a tabela com a lista de pedidos acumulados
        tablePedidos.setItems(
                OrderStorage.getInstance().getOrders()
        );
    }

    @FXML
    private void handleVoltar(ActionEvent e) throws IOException {
        Parent main = FXMLLoader.load(
                getClass().getResource(
                        "/org/example/restaurantevirtual/view/restaurante.fxml"
                )
        );
        Stage stage = (Stage) tablePedidos.getScene().getWindow();
        stage.setScene(new Scene(main, 630, 450));
        stage.setTitle("Restaurante Virtual");
    }
}
