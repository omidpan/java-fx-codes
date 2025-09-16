package champlaincollege.demo.shapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;

public class ShowLine extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {   
    // Create a scene and place it in the stage
    Scene scene = new Scene(new LinePane(), 200, 200);
    primaryStage.setTitle("ShowLine"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
}

class LinePane extends Pane {
  public LinePane() {
    Line line1 = new Line(10, 10, 10, 10);
    line1.endXProperty().bind(widthProperty().subtract(10));
    line1.endYProperty().bind(heightProperty().subtract(10));
    line1.setStrokeWidth(5);
    line1.setStroke(Color.GREEN);
    getChildren().add(line1);
    
    Line line2 = new Line(10, 10, 10, 10);
    line2.startXProperty().bind(widthProperty().subtract(10));
    line2.endYProperty().bind(heightProperty().subtract(10));
    line2.setStrokeWidth(5);
    line2.setStroke(Color.RED);
    getChildren().add(line2);

    //Horizontal Line in Center of pane
    Line hLine = new Line();
    hLine.startXProperty().set(0);
    hLine.endXProperty().bind(widthProperty());
    hLine.startYProperty().bind(heightProperty().divide(2));
    hLine.endYProperty().bind(heightProperty().divide(2));
    hLine.setStroke(Color.BLUE);

    // Vertical line in Center of pane
    Line vLine = new Line();
    vLine.startYProperty().set(0);
    vLine.endYProperty().bind(heightProperty());
    vLine.startXProperty().bind(widthProperty().divide(2));
    vLine.endXProperty().bind(widthProperty().divide(2));
    vLine.setStroke(Color.BLUE);

    getChildren().addAll(hLine, vLine);

  }
}