module pongl.lab4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens pongl.lab4 to javafx.fxml;
    exports pongl.lab4;
}