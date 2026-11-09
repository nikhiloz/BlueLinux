package android.text;

public class TextUtils {
    public static boolean isEmpty(CharSequence str) {
        return str == null || str.length() == 0;
    }

    public static boolean equals(CharSequence a, CharSequence b) {
        if (a == b) return true;
        if (a != null && b != null && a.length() == b.length()) {
            if (a instanceof String && b instanceof String) {
                return a.equals(b);
            }
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) return false;
            }
            return true;
        }
        return false;
    }
}
