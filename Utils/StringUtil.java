package Utils;

public class StringUtil {
    public static String capitalize(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

    public static String order (String a, String b){
        if (a.compareTo(b) > 0) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
