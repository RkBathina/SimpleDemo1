package com.prep.arrrays;

import java.util.Arrays;

public class MergeStringArrays {
    public static void main(String[] args) {
        String[] array1 = {"Hello", "world"};
        String[] array2 = {"Java", "program"};

        String[] mergedArray = mergeArrays(array1, array2);

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    public static String[] mergeArrays(String[] array1, String[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;

        String[] mergedArray = new String[length1 + length2];

//        System.arraycopy(array1, 0, mergedArray, 0, length1);
//        System.arraycopy(array2, 0, mergedArray, length1, length2);

        return mergedArray;
    }
}
