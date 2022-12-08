package class_example5;

import java.util.Scanner;

public class ClassSample02 {
    public static void main(String[] args) {
        String str1 = "one,two,three";
        String str2 = "apple orange peach";
        Scanner sc1 = new Scanner(str1);
        sc1.useDelimiter(",");
        while (sc1.hasNext()) {
            System.out.println(sc1.next());
        }

        Scanner sc2 = new Scanner(str2);
        while (sc2.hasNext()) {
            System.out.println(sc2.next());
        }
        sc1.close();
        sc2.close();
    }
}
