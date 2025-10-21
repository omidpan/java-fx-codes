package champlaincollege.demo.chapter17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectOutputStream {
  public static void main(String[] args) throws IOException {
    // Create an output stream for file object.dat
    try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"))) {
      // Write a string, double value, and object to the file
      output.writeUTF("Jamal");
      output.writeDouble(85.5);
      output.writeObject(new java.util.Date());
    }
  }
}