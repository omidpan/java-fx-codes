package champlaincollege.demo.chapter31.menu;

import champlaincollege.demo.utility.Utility;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MenuExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //Top Level of Window Control
        MenuBar menuBar = new MenuBar();
        //Nested Level added to MenuBar
        Menu fileMenu = new Menu("File");
        Menu helpMenu = new Menu("Help");
        //nested Level added to Menu
        MenuItem newItem = new MenuItem("New");

        MenuItem openItem = new MenuItem("Open",new ImageView(Utility.getResourceByName("/image/open.png", MenuExample.class)));
        MenuItem printItem = new MenuItem("Print");
        MenuItem exitItem = new MenuItem("Exit");
        //add MenuItems to helpMenu
        fileMenu.getItems().addAll(newItem, openItem, printItem, exitItem);
        MenuItem softwareItem = new MenuItem("Software");
        MenuItem hardwareItem = new MenuItem("Hardware");
        MenuItem macOSItem = new MenuItem("Mac OS");
        helpMenu.getItems().addAll(softwareItem, hardwareItem, macOSItem);
        //Add Menu to MenuBar
        menuBar.getMenus().addAll(fileMenu, helpMenu);

        //You can also embed menus inside menus so the embedded menus become submenus.
        Menu softwareHelpMenu = new Menu("Software");
        Menu hardwareHelpSubMenu = new Menu("Hardware");
        helpMenu.getItems().add(hardwareHelpSubMenu);
        helpMenu.getItems().add(softwareHelpMenu);
        softwareHelpMenu.getItems().add(new MenuItem("Unix"));
        softwareHelpMenu.getItems().add(new MenuItem("Windows"));
        softwareHelpMenu.getItems().add(new MenuItem("Mac OS"));
        //Add MenuBar to Pane
        Pane pane = new Pane(menuBar);

        Scene scene = new Scene(pane, 800, 600);


        //add Check-box menu to help
        helpMenu.getItems().add(new CheckMenuItem("Check it"));

        Menu colorMenu = new Menu("Color");
        colorMenu.getItems().add(new CheckMenuItem("Blue"));
        colorMenu.getItems().add(new CheckMenuItem("Yellow"));
        colorMenu.getItems().add(new CheckMenuItem("Red"));
        helpMenu.getItems().add(colorMenu);

        //adding RadioMenuItem
        RadioMenuItem rmiRed = new RadioMenuItem("Red");
        RadioMenuItem rmiYellow = new RadioMenuItem("Yellow");
        RadioMenuItem rmiBlue = new RadioMenuItem("Blue");
        //we need to add it to ToggleGroup
        ToggleGroup group = new ToggleGroup();
        rmiRed.setToggleGroup(group);
        rmiYellow.setToggleGroup(group);
        rmiBlue.setToggleGroup(group);
        //this is an option for seleciton
        rmiRed.setSelected(true);
        Menu radioMenu = new Menu("RadioColor");
        radioMenu.getItems().addAll(rmiRed, rmiYellow, rmiBlue);
        colorMenu.getItems().add(radioMenu);

        //add image to the menu change this code with line 22 with openMenu
//        MenuItem openItem = new MenuItem("Open",new ImageView(Utility.getResourceByName("/image/open.png", MenuExample.class)));

        // adding Key accelerator

        exitItem.setAccelerator(KeyCombination.keyCombination("Ctrl+X"));
        exitItem.setOnAction(e -> System.exit(0));



        stage.setScene(scene);
        stage.setTitle("Menu Demo Item");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
