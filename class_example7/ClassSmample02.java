package class_example7;

import java.text.NumberFormat;
import java.util.Locale;

public class ClassSmample02 {
    public static void main(String[] args) {
        int number = 12300;

        Locale jp = new Locale("ja", "JP");
        Locale us = new Locale("en", "US");
        Locale ch = new Locale("ch", "CH");

        NumberFormat nfJapan1 = NumberFormat.getInstance(jp);
        NumberFormat nfJapan2 = NumberFormat.getCurrencyInstance(jp);
        NumberFormat nfUsa1 = NumberFormat.getInstance(us);
        NumberFormat nfUsa2 = NumberFormat.getCurrencyInstance(us);
        NumberFormat nfChina1 = NumberFormat.getInstance(ch);
        NumberFormat nfChina2 = NumberFormat.getCurrencyInstance(ch);

        System.out.println(jp.getDisplayCountry());
        System.out.println("数値:" + nfJapan1.format(number));
        System.out.println("通貨:" + nfJapan2.format(number));
        System.out.println();

        System.out.println(us.getDisplayCountry());
        System.out.println("数値:" + nfUsa1.format(number));
        System.out.println("通貨:" + nfUsa2.format(number));
        System.out.println();

        System.out.println(ch.getDisplayCountry());
        System.out.println("数値:" + nfChina1.format(number));
        System.out.println("通貨:" + nfChina2.format(number));

    }
}
