package class_example3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ClassSample01 {
    public static void main(String[] args) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new BufferedWriter(new FileWriter("test/test.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        pw.print("printによる出力（改行なし）");
        pw.println("printlnによる出力（改行あり）");
        pw.printf("printfによる出力 %s", 5);
        System.out.println("Data Writeing Finished");

        pw.close();

    }
}
