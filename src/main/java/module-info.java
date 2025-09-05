module champlaincollege.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens champlaincollege.demo to javafx.fxml;
    exports champlaincollege.demo;
}