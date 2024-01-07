package StringUtils;

/**
 * StringUtils
 */
public class StringUtils {

    public static String betterString(String s1, String s2, MyFunction function) {
        return function.isBetter(s1, s2) ? s1 : s2;

    }

    public static Boolean isAlpha(String s) {
        Boolean alpha = true;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetter(s.charAt(i))) {
                alpha = false;
                break;
            }

        }
        return alpha;

    }
}