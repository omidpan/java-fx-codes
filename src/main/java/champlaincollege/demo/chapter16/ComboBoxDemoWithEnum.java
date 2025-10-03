package champlaincollege.demo.chapter16;

import champlaincollege.demo.utility.Country;
import champlaincollege.demo.utility.Utility;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;

/**
 * We can create an Enum class with all the flag Items
 */
public class ComboBoxDemoWithEnum extends Application {

  // Declare and create a description pane
  private DescriptionPane descriptionPane = new DescriptionPane();

  // Create a combo box for selecting countries
  private ComboBox<String> cbo = new ComboBox<>(); // flagTitles

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Set the first country (Canada) for display
    setDisplay(Country.CANADA);

    // Add combo box and description pane to the border pane
    BorderPane pane = new BorderPane();
      
    BorderPane paneForComboBox = new BorderPane();
    paneForComboBox.setLeft(new Label("Select a country: "));
    paneForComboBox.setCenter(cbo);
    pane.setTop(paneForComboBox);
    cbo.setPrefWidth(130);
    cbo.setValue(Country.CANADA.getCountryName());
    
    ObservableList<Country> items = FXCollections.observableArrayList(Country.values());
    //create list of country names
    List<String> countryNames=items.stream()
            .map(country ->country.getCountryName())
            .toList();
    // Add items from  Country enum  to combo box
    cbo.getItems().addAll(countryNames);
    pane.setCenter(descriptionPane);
    
    // Display the selected country
    cbo.setOnAction(e -> setDisplay(Country.valueOf(cbo.getValue())));
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 450, 170);
    primaryStage.setTitle("ComboBoxDemo With Enum"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  /** Set display information on the description pane */
  public void setDisplay(Country country) {
    descriptionPane.setTitle(country.getCountryName());
    descriptionPane.setImageView(new ImageView(Utility.getResource(country.getFlagImage(), ComboBoxDemoWithEnum.class)));
    descriptionPane.setDescription(country.getDescription());
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}