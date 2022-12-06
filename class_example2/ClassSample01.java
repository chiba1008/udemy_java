package class_example2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ClassSample01 {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        BufferedReader br = null;

        String FileName = "test/filesample2.txt";
        try {
            bw = new BufferedWriter(new FileWriter(FileName));
            bw.write("もも\n");
            bw.write("みかん\n");
            bw.write("桜\n");
            bw.flush();
            br = new BufferedReader(new FileReader(FileName));
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e1) {
            System.out.println("ファイルエラーです。");
        } catch (IOException e2) {
            System.out.println("IOエラーです。");
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("クローズ失敗");
            }
        }
    }
}
