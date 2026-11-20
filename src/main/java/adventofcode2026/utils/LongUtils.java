package adventofcode2026.utils;

public class LongUtils {
    public static boolean isLong(String input) {
        boolean isLong = true;
        try {
            Long.parseLong(input);
        } catch (NumberFormatException e) {
            isLong = false;
        }
        return isLong;
    }
}
