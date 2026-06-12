package app;

public class StringListProcessor {
    public static int countUppercase(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }
}
