package advanced.day4;

public class SampleEx401 {
    public static void main(String[] args) {
        CellPhone cp = new CellPhone("hogefuga@example.com", "090-1234-5678");
        cp.call("012-3456-7890");
        cp.sendMail("hogehoge@test.com");

        IPhone phone = (IPhone) cp;
        phone.call("098-7654-3210");

        IEmail mail = (IEmail) cp;
        mail.sendMail("example@test.com");

    }
}
