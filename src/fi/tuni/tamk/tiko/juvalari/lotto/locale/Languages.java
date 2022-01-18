package src.fi.tuni.tamk.tiko.juvalari.lotto.locale;

import java.util.Locale;
import java.util.ResourceBundle;
import java.io.Console;

public class Languages {
    static Locale english = new Locale("en", "US");
    static Locale finnish = new Locale("fi", "FI");
    static ResourceBundle msg = ResourceBundle.getBundle("src/fi/tuni/tamk/tiko/juvalari/lotto/locale/MessagesBundle", english);

    public static String readString(String errorMessageNonString) {
        Console c = System.console();
        String input = "";
        boolean correctLanguage = false;

        do {
            input = c.readLine();
            if(input.equalsIgnoreCase("finnish")) {
                correctLanguage = true;
                msg = ResourceBundle.getBundle("src/fi/tuni/tamk/tiko/juvalari/lotto/locale/MessagesBundle", finnish);
            }else if(input.equalsIgnoreCase("english")) {
                correctLanguage = true;
            }
            else {
                System.out.println(errorMessageNonString);
            }
        }while(correctLanguage == false);
        
        return input;
    }

    public static String welcome() {
        String welcomeMsg = msg.getString("welcome");
        return welcomeMsg;
    }
    public static String chooseLanguage() {
        String chooseLanguageMsg = msg.getString("chooseLanguage");
        return chooseLanguageMsg;
    }
    public static String notString() {
        String notStringMsg = msg.getString("notString");
        return notStringMsg;
    }
    public static String giveUniqueNum() {
        String giveUniqueNumMsg = msg.getString("giveUniqueNum");
        return giveUniqueNumMsg;
    }
    public static String notIntValue() {
        String notIntValueMsg = msg.getString("notIntValue");
        return notIntValueMsg;
    }
    public static String notBetweenMinAndMax() {
        String notBetweenMinAndMaxMsg = msg.getString("notBetweenMinAndMax");
        return notBetweenMinAndMaxMsg;
    }
    public static String notUnique() {
        String notUniqueMsg = msg.getString("notUnique");
        return notUniqueMsg;
    }
    public static String got() {
        String gotMsg = msg.getString("got");
        return gotMsg;
    }
    public static String right() {
        String rightMsg = msg.getString("right");
        return rightMsg;
    }
    public static String years() {
        String yearsMsg = msg.getString("years");
        return yearsMsg;
    }
    public static String although() {
        String althoughMsg = msg.getString("although");
        return althoughMsg;
    }
    public static String finallyTxt() {
        String finallyMsg = msg.getString("finally");
        return finallyMsg;
    }
    public static String lifetimes() {
        String lifetimesMsg = msg.getString("lifetimes");
        return lifetimesMsg;
    }
}
