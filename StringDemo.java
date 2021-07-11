import utils.SortingUtil;
import utils.StringUtil;

import java.util.*;

public class StringDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        System.out.println(a.length() + b.length());
        System.out.println(StringUtil.compare(a, b));
        System.out.println(StringUtil.capitalize(a) + " " + StringUtil.capitalize(b));


        String c = sc.nextLine();
        String d = sc.nextLine();

        if (StringUtil.areAnagramsCaseIgnored(c, d)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

    }
}