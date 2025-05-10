package org.example.restaurantevirtual.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class OrderStorage {
    private static final OrderStorage INSTANCE = new OrderStorage();
    private final ObservableList<Pedido> pedidos = FXCollections.observableArrayList();
    private OrderStorage() {}
    public static OrderStorage getInstance() { return INSTANCE; }
    public ObservableList<Pedido> getOrders() { return pedidos; }
    public void addOrder(Pedido p) { pedidos.add(p); }
}
