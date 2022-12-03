package advanced.day3;

public class SampleEx302 {
    public static void main(String[] args) {
        Crow2 c = new Crow2();
        Sparrow2 s = new Sparrow2();

        System.out.print(c.getName() + ":");
        c.sing();

        System.out.print(s.getName() + ":");
        s.sing();
    }
}
