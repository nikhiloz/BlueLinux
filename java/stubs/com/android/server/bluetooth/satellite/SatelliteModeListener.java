package com.android.server.bluetooth.satellite;

import android.content.ContentResolver;
import android.os.Looper;
import java.util.function.Consumer;

public class SatelliteModeListener {
    public static boolean isOn() { return false; }
    public static void initialize(Looper looper, ContentResolver resolver, Consumer<Boolean> modeCallback) {}
    public static void initialize(Object... args) {}
}
