package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.stream.IntStream;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
//        return null;
        int arr1 = array1.length;
        int arr2 = array2.length;
        Integer[] arrMerge = new Integer[arr1 + arr2];

        System.arraycopy(array1, 0, arrMerge, 0, arr1);
        System.arraycopy(array2, 0, arrMerge, arr1, arr2);
        return arrMerge;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return null;
    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
