package class_example1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ClassSample05 {
    public static void main(String[] args) {
        FileWriter fw = null;
        FileReader fr = null;
        try {
            String fileName = "test/File2.txt";
            fw = new FileWriter(fileName);
            fr = new FileReader(fileName);
            fw.write("アイウエオ\n");
            fw.write("かきくけこ\n");
            fw.flush();
            fw.write("さしすせそ\n");
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e1) {
            System.out.println("ファイルが見つかりません。");
        } catch (IOException e2) {
            System.out.println("ファイルエラーです。");
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {

            }
        }
    }
}
