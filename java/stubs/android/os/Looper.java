package android.os;

public class Looper {
    private static Looper sMainLooper = new Looper();

    public static void prepare() {}

    public static void loop() {}

    public static Looper myLooper() {
        return sMainLooper;
    }

    public static Looper getMainLooper() {
        return sMainLooper;
    }

    public void quit() {}

    public void quitSafely() {}

    public Thread getThread() {
        return Thread.currentThread();
    }
}
