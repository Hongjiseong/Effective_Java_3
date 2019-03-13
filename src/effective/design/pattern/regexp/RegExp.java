package effective.design.pattern.regexp;

import java.util.regex.Pattern;

public class RegExp {
    private static final Pattern ROMAN = Pattern.compile("표현식");

    static boolean isRomanNumeral(String text){
        return ROMAN.matcher(text).matches();
    }
}
