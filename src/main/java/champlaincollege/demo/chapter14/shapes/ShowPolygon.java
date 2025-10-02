package champlaincollege.demo.chapter14.shapes;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;

public class ShowPolygon extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {   
    // Create a scene and place it in the stage
    Scene scene = new Scene(new MyPolygon(), 400, 400);

    primaryStage.setTitle("ShowPolygon"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
class MyPolyLine extends Pane{

}

class MyPolygon extends Pane {
  /**
   *  setWidth inherited from Region (Region->Pane->MyPolygon)
   *  In this example we override them method
   * @param width
   */
  @Override
  public void setWidth(double width) {
    super.setWidth(width);
    paint();
  }
  /**
   *  setHeight inherited from Region (Region->Pane->MyPolygon)
   * @param height
   */
  @Override
  public void setHeight(double height) {
    super.setHeight(height);
    paint();
  }
  private void paint() {
    // Create a polygon and place polygon to pane
    Polygon polygon = new Polygon();
    polygon.setFill(Color.WHITE);
    polygon.setStroke(Color.BLACK);
    double centerX = this.getWidth() / 2;
    double centerY = this.getHeight() / 2;
    double radius = Math.min(getWidth(), getHeight()) * 0.4;

    //  Polygon has a List of its points . This list extended from java.util.List<E> .
    // for javafx we have special List named ObservableList
    //In JavaFX, Observable means “a value or collection that can be watched for changes.”
    //When the value changes,  bindings attached to it are notified automatically.
    ObservableList<Double> list = polygon.getPoints();
    // Add points to the polygon list
    for (int i = 0; i < 6; i++) {
      list.add(centerX + radius * Math.cos(2 * i * Math.PI / 6));
      list.add(centerY - radius * Math.sin(2 * i * Math.PI / 6));
    }

    getChildren().clear(); // Clear pane
    getChildren().add(polygon);
  }
}