import java.io.*;
import java.util.*;

public class StringIntro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        String lex;
        if (a.compareTo(b) > 0 ){
            lex = "Yes";
        } else {
            lex = "No";
        }

        a = a.substring(0,1).toUpperCase() + a.substring(1);
        b = b.substring(0,1).toUpperCase() + b.substring(1);

        System.out.println(a.length() + b.length());
        System.out.println(lex);
        System.out.println(a + " " + b);
    }
}