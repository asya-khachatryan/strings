import Utils.StringUtil;

import java.util.*;

public class StringDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        System.out.println(a.length() + b.length());
        System.out.println(StringUtil.order(a,b));
        System.out.println(StringUtil.capitalize(a) + " " + StringUtil.capitalize(b));
    }
}