package champlaincollege.demo.chapter17;

import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;

public class ReadBinaryExample {

    public static void main(String[] args) {
        byte[]bytes=new byte[5];
        bytes="HELLO".getBytes();

        for (int i=0;i<bytes.length;i++){
            System.out.print(bytes[i]+"\t");
            System.out.print(new String(new byte[]{bytes[i]}));
            System.out.println();
        }




    }
}
