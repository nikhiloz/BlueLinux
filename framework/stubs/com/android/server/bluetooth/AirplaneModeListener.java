package com.android.server.bluetooth;



public class AirplaneModeListener {
    
    public static boolean isOnOverrode() { return false; }
    public static boolean isOn() { return false; }
    public static boolean hasUserToggledApm(android.content.Context context) { return false; }
    public static void notifyUserToggledBluetooth(android.content.ContentResolver cr, android.content.Context ctx, boolean val) {}
    public static void initialize(Object... args) {}

}
