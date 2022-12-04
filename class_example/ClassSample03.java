package class_example;

import java.io.FileWriter;
import java.io.IOException;

public class ClassSample03 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("test/File.txt");
            for (int i = 1; i <= 5; i++) {
                fw.write(i + "行目\n");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("書き込みに失敗しました。");
        }
    }
}
