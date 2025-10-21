package champlaincollege.demo.chapter17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectInputStream {
  public static void main(String[] args)
    throws ClassNotFoundException, IOException {
    // Create an input stream for file object.dat
    try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("object.dat"))) {
      // Read a string, double value, and object from the file
      String name = input.readUTF();
      double score = input.readDouble();
      java.util.Date date = (java.util.Date)(input.readObject());
      System.out.println(name + " " + score + " " + date);
    }
  }
}