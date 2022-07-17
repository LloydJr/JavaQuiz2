package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
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
//        return null;
        index = index % array.length;
        List<Integer> arrayCopy = new ArrayList<>(Arrays.asList(array));
        List<Integer> toRotate = new ArrayList<>(arrayCopy.subList(index, arrayCopy.size()));
        toRotate.addAll(arrayCopy.subList(0, index));
        return toRotate.toArray(new Integer[0]);
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
//        return null;
        Integer[] array = merge(array1, array2);
        Integer count = 0;
        for (Integer i : array)
            if (Objects.equals(i, valueToEvaluate))
                count++;
        return count;
    }

    public Integer mostCommon(Integer[] array) {
        return null;

    }
}
