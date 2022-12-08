package class_example7;

import java.util.Locale;

public class ClassSample01 {
    public static void main(String[] args) {
        Locale jp = new Locale("ja", "JP");
        Locale us = new Locale("en", "US");
        Locale ch = new Locale("zh", "CH");

        System.out.println("日本のロケール 言語：" + jp.getDisplayLanguage() + " 国名 :" + jp.getDisplayCountry());
        System.out.println("USAのロケール 言語：" + us.getDisplayLanguage() + " 国名 :" + us.getDisplayCountry());
        System.out.println("Chinaのロケール 言語：" + ch.getDisplayLanguage() + " 国名 :" + ch.getDisplayCountry());

    }
}
