package android.provider;

import android.content.ContentResolver;

public final class Settings {
    public static final class Secure {
        public static final String BLUETOOTH_NAME = "bluetooth_name";
        public static final String BLUETOOTH_ADDRESS = "bluetooth_address";
        public static final String BLUETOOTH_ADDR_VALID = "bluetooth_addr_valid";
        public static String getString(ContentResolver resolver, String name) { return null; }
        public static boolean putString(ContentResolver resolver, String name, String value) { return true; }
        public static int getInt(ContentResolver resolver, String name, int def) { return def; }
        public static boolean putInt(ContentResolver resolver, String name, int value) { return true; }
    }

    public static final class Global {
        public static final String BLUETOOTH_ON = "bluetooth_on";
        public static final String AIRPLANE_MODE_ON = "airplane_mode_on";
        public static String getString(ContentResolver resolver, String name) { return null; }
        public static boolean putString(ContentResolver resolver, String name, String value) { return true; }
        public static int getInt(ContentResolver resolver, String name, int def) { return def; }
        public static boolean putInt(ContentResolver resolver, String name, int value) { return true; }
    }

    public static final class System {
        public static String getString(ContentResolver resolver, String name) { return null; }
    }
}
