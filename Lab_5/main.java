import StringUtils.StringUtils;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        String string1 = "Ibrahim";
        String string2 = "Gaber23131313";
        String longer = StringUtils.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
        System.out.println(longer);
        System.out.println(StringUtils.isAlpha(longer));
    }
}