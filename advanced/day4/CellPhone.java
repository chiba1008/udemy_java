package advanced.day4;

public class CellPhone implements IPhone, IEmail {
    private String mailAddress;
    private String number;

    public CellPhone(String mailAdress, String number) {
        this.mailAddress = mailAdress;
        this.number = number;
    }

    public void sendMail(String address) {
        System.out.println(address + "に、" + this.mailAddress + "からメールを出します。");
    }

    public void call(String number) {
        System.out.println(number + "に、" + this.number + "から電話をかけます。");
    }
}
