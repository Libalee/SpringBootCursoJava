package com.example.demo.converters;

import java.util.Locale;

public class MathConverter {
    
    public static Double convertToDouble(String string) {
        Locale.setDefault(Locale.US);

        if(isNumeric(string)) {
            return Double.parseDouble(string);
        } else {
            return 0D;
        }
    }



    public static boolean isNumeric(String string) {
        Locale.setDefault(Locale.US);

        string.replace(',', '.');

        try {
            Double.parseDouble(string);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }

    }

}
