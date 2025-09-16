module champlaincollege.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.compiler;
    requires javafx.graphics;


    opens champlaincollege.demo to javafx.fxml;
    exports champlaincollege.demo;
    exports champlaincollege.demo.panes;
    opens champlaincollege.demo.panes to javafx.fxml;
    exports champlaincollege.demo.shapes;
    opens champlaincollege.demo.shapes to javafx.fxml;
    exports champlaincollege.demo.clockdemo;
    opens champlaincollege.demo.clockdemo to javafx.fxml;
}