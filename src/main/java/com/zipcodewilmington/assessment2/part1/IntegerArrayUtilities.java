package com.zipcodewilmington.assessment2.part1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
//        return null;
            if (array.length % 2 == 0)
                return true;
        return false;
    }

    public Integer[] range(int start, int stop) {
//        return null;
        int[] range = IntStream.rangeClosed(start, stop).toArray();
        Integer[] finalRange = IntStream.of(range).boxed().toArray(Integer[] :: new);
        return finalRange;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
//        return null;
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
//        return null;
        return array[array.length - 1] * array[array.length-2];
    }
}
