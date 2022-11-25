package day6;

public class SampleClass01 {
    int n = 10;
    String s = "field";

    int add(int a, int b) {
        return a + b;
    }

    String add(String s) {
        return this.s + s;
    }

    void showNum() {
        System.out.println("n = " + n);
        System.out.println("s = " + s);

    }
}
