package champlaincollege.demo.panes;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class CourseWithHboxAndVbox extends Application {
    @Override
    public void start(Stage primaryState) throws Exception {
        //Borderpane

        BorderPane borderPane = new BorderPane();
//        addSimpleHBoxAndVBox(borderPane);
        //addModified Hbox
        addModifiedHBox(borderPane);
//
//        //Manage collection of nodes into VBox layout
        addVBoxWithCollectionOfLabelsToLeft(borderPane);
        //create Scene
        Scene scene = new Scene(borderPane);

        //add scene to stage
        primaryState.setScene(scene);
        //show stage
        primaryState.setTitle("Course With Hbox and Vbox");
        primaryState.show();

    }


    private void addModifiedHBox(BorderPane borderPane) {
        HBox hBox = new HBox(15); // Create an HBox with 15px spacing
        hBox.setPadding(new Insets(15, 15, 15, 15));
        hBox.setStyle("-fx-background-color: gold");
        hBox.getChildren().add(new Button("Computer Science"));
        hBox.getChildren().add(new Button("Chemistry"));
        Image image = new Image(getClass().getResourceAsStream("/image/course.png"));
        ImageView imageView = new ImageView(image);
        hBox.getChildren().add(imageView);
        borderPane.setTop(hBox);
    }

    private void addSimpleHBoxAndVBox(BorderPane borderPane) {
        //add horizental box
        HBox hbox = new HBox(20);
        VBox vbox = new VBox(20);
        hbox.getChildren().add(new Label("Course"));
        hbox.setStyle("-fx-background-color: Gold");
        borderPane.setTop(hbox);
        vbox.setStyle("-fx-background-color: Green");
        vbox.getChildren().add(new Label("list"));
        //add verticalBox
        borderPane.setLeft(vbox);
    }


    private void addVBoxWithCollectionOfLabelsToLeft(BorderPane borderPane) {
        VBox vBox = new VBox(15); // Create a VBox with 15px spacing
        vBox.setPadding(new Insets(15, 5, 5, 5));
        vBox.getChildren().add(new Label("Courses"));

        Label[] courses = {new Label("CSCI 1301"), new Label("CSCI 1302"),
                new Label("CSCI 2410"), new Label("CSCI 3720")};

        for (Label course: courses) {
            VBox.setMargin(course, new Insets(0, 0, 0, 15));
            vBox.getChildren().add(course);
        }

        borderPane.setLeft(vBox);
    }

    /**
     *
     * @return HBox
     */
    private HBox getHBox() {
        HBox hBox = new HBox(15); // Create an HBox with 15px spacing
        hBox.setPadding(new Insets(15, 15, 15, 15));
        hBox.setStyle("-fx-background-color: gold");
        hBox.getChildren().add(new Button("Computer Science"));
        hBox.getChildren().add(new Button("Chemistry"));
        Image image =new Image(getClass().getResource("/image/course.png").toExternalForm());
        ImageView imageView = new ImageView(image);
        hBox.getChildren().add(imageView);
        return hBox;
    }

    /**
     *
     * @return VBox
     */
    private VBox getVBox() {
        VBox vBox = new VBox(15); // Create a VBox with 15px spacing
        vBox.setPadding(new Insets(15, 5, 5, 5));
        vBox.getChildren().add(new Label("Courses"));

        Label[] courses = {new Label("CSCI 1301"), new Label("CSCI 1302"),
                new Label("CSCI 2410"), new Label("CSCI 3720")};

        for (Label course: courses) {
            VBox.setMargin(course, new Insets(0, 0, 0, 15));
            vBox.getChildren().add(course);
        }

        return vBox;
    }



    public static void main(String[] args) {
        launch(args);
    }
}
