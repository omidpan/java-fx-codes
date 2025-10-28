package champlaincollege.demo.utility;

import javafx.scene.image.Image;

public class Utility {


    public static String getResource(String name,Class clazz){
       return  clazz.getResource("/image/"+name).toExternalForm();

    }
    public static String getResourceByName(String name , Class clazz){
        return  clazz.getResource(name).toExternalForm();
    }
    public static Image createImageFromResource(String name,Class clazz){
      return   new Image(clazz.getResourceAsStream("/image/"+name));
    }
}
