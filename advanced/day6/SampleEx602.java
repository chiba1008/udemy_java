package advanced.day6;

import java.util.*;

public class SampleEx602 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("山田太郎");
        hs.add("山田太郎");
        hs.add("鈴木一郎");
        hs.add("test");
        hs.add("test");

        for (String s : hs) {
            System.out.println(s);
        }
    }
}
