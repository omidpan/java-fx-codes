package champlaincollege.demo.chapter31;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.*;
  
public class StrokeDemo extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {

    Rectangle rectangle0 = new Rectangle(20, 20, 70, 120);
    rectangle0.setFill(Color.BLACK);
//No StrokeType and MITER join
    Rectangle rectangle1 = new Rectangle(20, 20, 70, 120);
    rectangle1.setFill(Color.BLACK);
    rectangle1.setStrokeWidth(10);
    rectangle1.setStroke(Color.ORANGE);
    rectangle1.setTranslateX(100);

    //inside StrokeType and Bevel join
    Rectangle rectangle2 = new Rectangle(20, 20, 70, 120);
    rectangle2.setFill(Color.BLACK);
    rectangle2.setStrokeWidth(10);
    rectangle2.setStroke(Color.ORANGE);
    rectangle2.setStrokeType(StrokeType.INSIDE);
    rectangle2.setTranslateX(200);
    rectangle2.setStrokeLineJoin(StrokeLineJoin.ROUND);

    //outside StrokeType and round join
    Rectangle rectangle3 = new Rectangle(20, 20, 70, 120);
    rectangle3.setFill(Color.BLACK);
    rectangle3.setStrokeWidth(10);
    rectangle3.setStroke(Color.ORANGE);
    rectangle2.setStrokeType(StrokeType.OUTSIDE);
    rectangle3.setTranslateX(300);
    rectangle3.setStrokeLineJoin(StrokeLineJoin.ROUND);

    // Line StrokeLineCap.BUTT
    Line line1 = new Line(20, 200, 150, 200);
    line1.setStrokeLineCap(StrokeLineCap.BUTT);
    line1.setStrokeWidth(50);

    // Line StrokeLineCap.ROUND
    Line line2 = new Line(20, 250, 150, 250);
    line2.setStrokeLineCap(StrokeLineCap.ROUND);
    line2.setStrokeWidth(20);

    // Line StrokeLineCap.SQUARE
    Line line3 = new Line(20, 300, 150, 300);
    line3.setStrokeLineCap(StrokeLineCap.SQUARE);
    line3.setStrokeWidth(50);

    // Line with Dash pattern
    Line line4 = new Line(460, 20, 560, 120);
    line4.getStrokeDashArray().addAll(10.0, 20.0, 30.0, 40.0);

    // Line with Dash pattern and Offset opaque and dash
    Line line5 = new Line(580, 20, 650, 120);
    line5.getStrokeDashArray().addAll(5.0,20.0,30.0,40.0,10.0,20.0);
    line5.setStrokeDashOffset(5);
    //add all node as children to the pane
    Pane pane = new Pane();
    pane.getChildren().addAll(rectangle0,rectangle1, rectangle2, rectangle3, line1, line2, line3, line4,line5);
  
    Scene scene = new Scene(pane, 700, 400);
    primaryStage.setTitle("StrokeDemo"); // Set the window title
    primaryStage.setScene(scene); // Place the scene in the window
    primaryStage.show(); // Display the window
  }

  // Launch the program from command-line
  public static void main(String[] args) {
    launch(args);
  }
}