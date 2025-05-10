module org.example.restaurantevirtual {
    requires javafx.controls;
    requires javafx.fxml;

    exports org.example.restaurantevirtual;

    opens org.example.restaurantevirtual            to javafx.fxml;
    opens org.example.restaurantevirtual.controller to javafx.fxml;
    // AQUI: abre também para javafx.base, não só para javafx.fxml
    opens org.example.restaurantevirtual.model      to javafx.fxml, javafx.base;
}
