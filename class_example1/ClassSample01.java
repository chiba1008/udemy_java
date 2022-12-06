package class_example1;

import java.io.File;
import java.io.IOException;

public class ClassSample01 {
    public static void main(String[] args) {
        try {
            File file = new File("filesample.txt");
            System.out.println();
            System.out.println(file.exists());
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            System.out.println("処理に失敗しました。");
        }
    }
}
