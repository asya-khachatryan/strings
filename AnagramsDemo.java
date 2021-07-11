import Utils.AnagramsUtil;

import java.util.*;

public class AnagramsDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        AnagramsUtil.insertionSort(arr1);
        AnagramsUtil.quickSort(arr2, 0, arr2.length - 1);

        System.out.println(AnagramsUtil.anagrams(arr1, arr2));

    }
}