package utils;

import java.util.Arrays;

public class StringUtil {
    public static String capitalize(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

    public static String compare (String a, String b){
        if (a.compareTo(b) > 0) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static boolean areAnagrams(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        SortingUtil.insertionSort(arr1);
        SortingUtil.quickSort(arr2, 0, arr2.length - 1);

        if (Arrays.equals(arr1, arr2)) {
            return true;
        } else {
            return false;
        }
    }

}
