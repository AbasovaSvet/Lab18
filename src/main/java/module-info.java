module aba.lab18 {
    requires javafx.controls;
    requires javafx.fxml;


    opens aba.lab18 to javafx.fxml;
    exports aba.lab18;
}