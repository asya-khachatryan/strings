import utils.AnagramsUtil;
import utils.SortingUtil;
import utils.StringUtil;

import java.util.*;

public class StringDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        System.out.println(a.length() + b.length());
        System.out.println(StringUtil.order(a,b));
        System.out.println(StringUtil.capitalize(a) + " " + StringUtil.capitalize(b));


        String c = sc.nextLine().toLowerCase();
        String d = sc.nextLine().toLowerCase();

        char[] arr1 = c.toCharArray();
        char[] arr2 = d.toCharArray();

        SortingUtil.insertionSort(arr1);
        SortingUtil.quickSort(arr2, 0, arr2.length - 1);

        System.out.println(AnagramsUtil.anagrams(arr1, arr2));

    }
}