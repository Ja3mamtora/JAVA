import java.util.*;
import java.io.*;

public class p2 {
    public static void main(String[] args) throws IOException {
        FileReader sourceStream = null;
        try {
            sourceStream = new FileReader("/Desktop/demo.rtf");
            int temp;
            while ((temp = sourceStream.read()) != -1)
                System.out.println((char) temp);
            System.out.println("Program successfully executed");
        } finally {
            if (sourceStream != null)
                sourceStream.close();
        }
    }
}
