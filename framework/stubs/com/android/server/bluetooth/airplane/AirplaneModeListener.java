package com.android.server.bluetooth.airplane;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Looper;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class AirplaneModeListener {
    public static boolean isOnOverrode() { return false; }
    public static boolean isOn() { return false; }
    public static boolean hasUserToggledApm(Context context) { return false; }
    public static void notifyUserToggledBluetooth(ContentResolver cr, Context ctx, boolean val) {}
    public static void initialize(
        Looper looper,
        ContentResolver resolver,
        Object state,
        Consumer<Boolean> modeCallback,
        Consumer<String> notificationCallback,
        Supplier<Boolean> mediaCallback,
        Supplier<Context> userCallback,
        Object timeSource
    ) {}
    public static void initialize(Object... args) {}
}
