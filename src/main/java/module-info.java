module com.dietiestates25.dietiestates25 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dietiestates25.dietiestates25 to javafx.fxml;
    exports com.dietiestates25.dietiestates25;
    exports com.dietiestates25.dietiestates25.Controller;
    opens com.dietiestates25.dietiestates25.Controller to javafx.fxml;
}