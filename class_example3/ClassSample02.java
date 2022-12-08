package class_example3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ClassSample02 {
    public static void main(String[] args) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new BufferedWriter(new FileWriter("test/test2.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        pw.println("Line1");
        pw.println("Line2");
        pw.flush();
        System.out.println("Data Writeing Finished");

        // pw.close();

    }
}
