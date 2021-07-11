package utils;

import java.util.Arrays;

public class AnagramsUtil {

    private AnagramsUtil() {
    }

    public static String anagrams(char[] a, char[] b) {
        if (Arrays.equals(a, b)) {
            return "Anagrams";
        } else {
            return "Not Anagrams";
        }
    }
}
