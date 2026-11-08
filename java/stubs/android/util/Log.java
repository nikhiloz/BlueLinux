package android.util;

public final class Log {
    public static final int VERBOSE = 2;
    public static final int DEBUG = 3;
    public static final int INFO = 4;
    public static final int WARN = 5;
    public static final int ERROR = 6;
    public static final int ASSERT = 7;

    public static int v(String tag, String msg) {
        System.out.println("[VERBOSE] " + tag + ": " + msg);
        return 0;
    }

    public static int v(String tag, String msg, Throwable tr) {
        System.out.println("[VERBOSE] " + tag + ": " + msg);
        if (tr != null) tr.printStackTrace(System.out);
        return 0;
    }

    public static int d(String tag, String msg) {
        System.out.println("[DEBUG] " + tag + ": " + msg);
        return 0;
    }

    public static int d(String tag, String msg, Throwable tr) {
        System.out.println("[DEBUG] " + tag + ": " + msg);
        if (tr != null) tr.printStackTrace(System.out);
        return 0;
    }

    public static int i(String tag, String msg) {
        System.out.println("[INFO] " + tag + ": " + msg);
        return 0;
    }

    public static int i(String tag, String msg, Throwable tr) {
        System.out.println("[INFO] " + tag + ": " + msg);
        if (tr != null) tr.printStackTrace(System.out);
        return 0;
    }

    public static int w(String tag, String msg) {
        System.out.println("[WARN] " + tag + ": " + msg);
        return 0;
    }

    public static int w(String tag, String msg, Throwable tr) {
        System.out.println("[WARN] " + tag + ": " + msg);
        if (tr != null) tr.printStackTrace(System.out);
        return 0;
    }

    public static int e(String tag, String msg) {
        System.err.println("[ERROR] " + tag + ": " + msg);
        return 0;
    }

    public static int e(String tag, String msg, Throwable tr) {
        System.err.println("[ERROR] " + tag + ": " + msg);
        if (tr != null) tr.printStackTrace(System.err);
        return 0;
    }

    public static boolean isLoggable(String tag, int level) {
        return true;
    }

    public static String getStackTraceString(Throwable tr) {
        if (tr == null) return "";
        java.io.StringWriter sw = new java.io.StringWriter();
        java.io.PrintWriter pw = new java.io.PrintWriter(sw);
        tr.printStackTrace(pw);
        return sw.toString();
    }

    public static String timeToStringWithZone(long time) { return ""; }
    public static String timeToStringWithZone(Long time) { return ""; }
}
