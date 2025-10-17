package champlaincollege.demo.chapter17;

import java.io.*;

public class TestDataStream {
  public static void main(String[] args) throws IOException {
//     Create an output stream for file temp.dat
    try (DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"))) {
      // Write student test scores to the file
      output.writeUTF("Liam");
      output.writeDouble(85.5);
      output.writeUTF("Susan");
      output.writeDouble(185.5);
      output.writeUTF("Chandra");
      output.writeDouble(105.25);
      output.writeLong(10L);
      output.writeChar('c');
      output.writeUTF("This is the test");
    }
    // Create an input stream for file temp.dat
    try (DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));) {
      // Read student test scores from the file
      System.out.println(input.readUTF() + " " + input.readDouble());
      System.out.println(input.readUTF() + " " + input.readDouble());
      System.out.println(input.readUTF() + " " + input.readDouble());
      System.out.println(input.readLong() + " " + input.readChar());
      System.out.println(input.readUTF());
    }
  }
}