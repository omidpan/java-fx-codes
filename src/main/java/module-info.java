module champlaincollege.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.compiler;
    requires java.desktop;


    opens champlaincollege.demo to javafx.fxml;
    exports champlaincollege.demo;
    exports champlaincollege.demo.panes;
    opens champlaincollege.demo.panes to javafx.fxml;
}