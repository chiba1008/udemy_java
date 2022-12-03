package advanced.day1;

public class SampleClassEx101 {
    public int value = 0;
    public static int num = 0;

    public SampleClassEx101(int value) {
        this.value = value;
        num++;
    }

    public SampleClassEx101() {
        this(100);
    }

    public static int getNumberOfInstance() {
        return num;
    }

    public int getValue() {
        return this.value;
    }
}
