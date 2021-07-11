import java.io.*;
import java.util.*;

public class AnagramsDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        SortingUtil.insertionSort(arr1);
        SortingUtil.quickSort(arr2, 0, arr2.length - 1);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}