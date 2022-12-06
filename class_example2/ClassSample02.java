package class_example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassSample02 {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                String s;
                System.out.print("Input Data <q : finish> : ");
                s = br.readLine();
                if (s.equals("q")) {
                    break;
                }
                System.out.println("Input Data: " + s);
                System.out.println();
            }
        } catch (IOException e2) {
            System.out.println("IOerror");
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("IOerror");
            }
        }
    }
}
