package class_example6;

public class ClassSample02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Apple");
        sb.append("Banana");
        sb.insert(6, "Peach ");
        System.out.println(sb);
    }
}
