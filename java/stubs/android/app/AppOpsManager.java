package android.app;

public class AppOpsManager {
    public static final int MODE_ALLOWED = 0;
    public static final int MODE_IGNORED = 1;
    public static final int MODE_ERRORED = 2;

    public int noteOpNoThrow(String op, int uid, String packageName) {
        return MODE_ALLOWED;
    }

    public int checkOpNoThrow(String op, int uid, String packageName) {
        return MODE_ALLOWED;
    }


    public void checkPackage(int uid, String packageName) {}

}
