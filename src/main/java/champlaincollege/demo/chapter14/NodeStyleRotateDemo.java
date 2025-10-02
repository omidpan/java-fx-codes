package champlaincollege.demo.chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class NodeStyleRotateDemo extends Application {
  @Override // Override the start method in the Application class
  //stage
  public void start(Stage primaryStage) {
    // Create a pane and place a button in the pane
    StackPane pane = new StackPane();
    Button btOK = new Button("OK");
    btOK.setStyle("-fx-border-color: blue;");
    btOK.setRotate(45);
    pane.getChildren().add(btOK);

    pane.setRotate(45); // Rotate pane 45 degrees
    pane.setStyle("-fx-border-color: red; -fx-background-color: lightgray;");


    //create scene and add pane
    Scene scene = new Scene(pane, 200, 250);
    primaryStage.setTitle("NodeStyleRotateDemo"); // Set the stage title
    //add scene to stage
    primaryStage.setScene(scene); // Place the scene in the stage

    //show stage
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