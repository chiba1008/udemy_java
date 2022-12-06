package class_example1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ClassSample04 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("test/File.txt");
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
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                System.out.println("ファイルクローズに失敗しました。");
            }
        }
    }
}
