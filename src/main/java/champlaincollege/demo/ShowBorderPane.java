package champlaincollege.demo;

import com.sun.source.tree.Tree;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ShowBorderPane extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a border pane 
    BorderPane pane = new BorderPane();
    //addNodes has runtime issue
    addNodes(pane);
    //best practice
    addNodesWithCustomPane(pane);

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("ShowBorderPane"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  /**
   *   we are not able to add duplicate objects into pane Tree
   *   because we have reference object problem
   * @param pane
   */
  private void addNodes(BorderPane pane) {
    StackPane stackPane = new StackPane();
    stackPane.setPadding(new Insets(10, 10, 10, 10));
    stackPane.setStyle("-fx-background-color: Red");
    stackPane.getChildren().add(new Label("This is a border pane"));
    pane.setTop(stackPane);
    pane.setRight(stackPane);
    pane.setBottom(stackPane);
    pane.setLeft(stackPane);
    pane.setCenter(stackPane);
  }
  /**
   * everyTime add new Object to the BorderPane
   * @param pane is A BorderPane
   */
  private void addNodesWithCustomPane(BorderPane pane) {
        // Place nodes in the pane
    pane.setTop(new CustomPane("Top"));
    pane.setRight(new CustomPane("Right"));
    pane.setBottom(new CustomPane("Bottom"));
    pane.setLeft(new CustomPane("Left"));
    pane.setCenter(new CustomPane("Center"));
  }


}
// Define a custom pane to hold a label in the center of the pane
final class CustomPane extends StackPane {
  public CustomPane(String title) {
    getChildren().add(new Label(title));
    setStyle("-fx-border-color: red");
    setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
  }
}



