package com.zipcodewilmington.assessment2.part1;

import java.util.Locale;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
//        return null;
        return value >= 5;
    }

    public Boolean isLessThan7(Integer value) {
//        return null;
        return value <= 7;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
//        return null;
        return 5 <= valueToEvaluate && valueToEvaluate <= 7;
    }

    public Boolean startsWith(String string, Character character) {
//        return null;
        return string.toLowerCase().charAt(0) == character || string.toUpperCase().charAt(0) == character;
    }
}
