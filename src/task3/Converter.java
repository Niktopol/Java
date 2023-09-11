package task3;

import java.text.NumberFormat;
import java.util.Locale;

public class Converter {
    public static String convert(double money, Locale prev, Locale next){
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(next);
        if (prev == Locale.US){
            if (next == Locale.CHINA){
                return numberFormat.format(money*7.3552);
            }else if (next == Locale.FRANCE){
                return numberFormat.format(money*0.9336);
            }
        }else if (prev == Locale.CHINA){
            if (next == Locale.US){
                return numberFormat.format(money*0.136);
            }else if (next == Locale.FRANCE){
                return numberFormat.format(money*0.1269);
            }
        }else if (prev == Locale.FRANCE){
            if (next == Locale.US){
                return numberFormat.format(money*1.0711);
            }else if (next == Locale.CHINA){
                return numberFormat.format(money*7.8783);
            }
        }
        return numberFormat.format(money);
    }
}
