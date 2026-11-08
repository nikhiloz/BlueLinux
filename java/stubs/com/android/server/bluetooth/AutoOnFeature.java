package com.android.server.bluetooth;
public class AutoOnFeature {
    public static void pause() {}
    public static void notifyBluetoothOn(android.content.Context context) {}
    public static void resetAutoOnTimerForUser(android.os.Looper looper, android.content.Context context, BluetoothAdapterState state, Runnable r) {}
    public static void resetAutoOnTimerForUser(android.os.Looper looper, android.content.Context context, Object... args) {}
    public static boolean isUserSupported(android.content.ContentResolver cr) { return true; }
    public static boolean isUserEnabled(android.content.Context context) { return true; }
    public static void setUserEnabled(android.os.Looper looper, android.content.Context context, BluetoothAdapterState state, boolean enabled, Runnable r) {}
    public static void setUserEnabled(Object... args) {}
}
