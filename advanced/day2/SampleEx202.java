package advanced.day2;

public class SampleEx202 {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.toString());
        System.out.println(c.getClass());
        Object o = (Object) c;
        System.out.println(o.toString());
        System.out.println(o.getClass());

    }
}
