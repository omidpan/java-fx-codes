package champlaincollege.demo.chapter14.shapes;

import javafx.application.Application;
import javafx.scene.Group;// used to Group nodes
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;

public class ShowRectangle extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {       
    // Create rectangles 
    Rectangle r1 = new Rectangle(25, 10, 60, 30);
    r1.setStroke(Color.BLACK);
    r1.setFill(Color.WHITE);
    Rectangle r2 = new Rectangle(25, 50, 60, 30);
    Rectangle r3 = new Rectangle(25, 90, 60, 30);
    r3.setArcWidth(15);
    r3.setArcHeight(25);
    /**
     * We can create a Group object from Group class which is inherited from Scene 
     */
    // Create a group and add nodes to the group
    Group group = new Group();
    group.getChildren()
            .addAll(new Text(10, 27, "r1"), r1,
            new Text(10, 67, "r2"), r2,
            new Text(10, 107, "r3"), r3
    );
    /**
     * If you want to create more than node and add them to the group , it would be nice to have a method
     */
    makeRectangles(group,Color.YELLOWGREEN,5);

    // Create a scene and place it in the stage
    Scene scene = new Scene(new BorderPane(group), 250, 150);
    primaryStage.setTitle("ShowRectangle"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

  private static void makeRectangles(Group group,Color color,int count ) {
    for (int i = 0; i < count; i++) {
      Rectangle r = new Rectangle(100, 50, 100, 30);
      r.setRotate(i * 360 / 8);
      r.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
      r.setFill(color);
      group.getChildren().add(r);
    }
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}