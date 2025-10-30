package champlaincollege.demo.chapter31;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class ScalingExample extends Application {

    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();

        // Original rectangle
        Rectangle original = new Rectangle(100, 100, 50, 50);
        original.setFill(Color.DARKGRAY);
        original.setStroke(Color.BLACK);

        // Clone a larger rectangle with  scaled size
        Rectangle scaled = new Rectangle(100, 100, 50, 50);
        scaled.setFill(Color.DARKGRAY);
        scaled.setStroke(Color.BLACK);
        scaled.setScaleX(2);
        scaled.setScaleY(2);

        // Add both shapes to the pane
        pane.getChildren().addAll(scaled,original);

        Scene scene = new Scene(pane, 400, 300);
        stage.setTitle("Scaling Example (x=2, y=2)");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
