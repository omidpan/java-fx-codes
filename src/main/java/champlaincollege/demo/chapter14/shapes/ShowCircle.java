package champlaincollege.demo.chapter14.shapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a circle and set its properties
    Circle circle = new Circle();
    circle.setCenterX(750);
    circle.setCenterY(500);
    circle.setRadius(100);
    circle.setStroke(Color.BLACK); // Set circle stroke color
    circle.setFill(Color.GOLD);
    
    // Create a pane to hold the circle 
    Pane pane = new Pane();
    pane.getChildren().add(circle);
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 200, 200);
    primaryStage.setTitle("ShowCircle"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    showInfo();
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }

  private void showInfo(){
    System.out.println("First demo");
  }
}