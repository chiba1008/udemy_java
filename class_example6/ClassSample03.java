package class_example6;

public class ClassSample03 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Apple ");
        sb.append("Orange");
        sb.append("Peach");
        System.out.println(sb);
        sb.delete(6, 10);
        System.out.println(sb);

    }
}
