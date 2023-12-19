module org.example.main {
    requires javafx.controls;
    requires javafx.fxml;


    opens Praktikum6 to javafx.fxml;
    exports Praktikum6;
}