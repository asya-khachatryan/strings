import java.io.*;
import java.util.*;

public class StringDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        String lex;
        if (a.compareTo(b) > 0) {
            lex = "Yes";
        } else {
            lex = "No";
        }

        System.out.println(a.length() + b.length());
        System.out.println(lex);
        System.out.println(StringUtil.capitalize(a) + " " + StringUtil.capitalize(b));
    }
}