package class_example5;

public class ClassSample01 {
    public static void main(String[] args) {
        String str1 = "one,two,three";
        String str2 = "apple orange peach";

        String[] strarray1 = str1.split(",");
        String[] strarray2 = str2.split(" ");

        for (String s : strarray1) {
            System.out.println(s);
        }
        for (String s : strarray2) {
            System.out.println(s);
        }
    }
}
