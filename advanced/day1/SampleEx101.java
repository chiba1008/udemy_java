package advanced.day1;

public class SampleEx101 {
    public static void main(String[] args) {
        SampleClassEx101 s1, s2, s3;
        System.out.println("インスタンス数:" + SampleClassEx101.getNumberOfInstance());

        s1 = new SampleClassEx101(50);
        s2 = new SampleClassEx101();

        System.out.println(s1.getValue());
        System.out.println(s2.getValue());

        System.out.println("インスタンス数:" + SampleClassEx101.getNumberOfInstance());

        s3 = new SampleClassEx101(200);
        System.out.println(s3.getValue());
        System.out.println("インスタンス数:" + SampleClassEx101.getNumberOfInstance());

    }
}
