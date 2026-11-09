package android.sysprop;
public class BluetoothProperties {
    public enum snoop_log_mode_values { DISABLED, FILTERED, FULL }
    public static class OptionalEnum {
        public snoop_log_mode_values orElse(snoop_log_mode_values val) { return val; }
    }
    public static class OptionalBoolean {
        public boolean orElse(boolean val) { return val; }
    }
    public static OptionalBoolean isProfileAshaCentralEnabled() { return new OptionalBoolean(); }
    public static OptionalBoolean isAdapterAddressValidationEnabled() { return new OptionalBoolean(); }
    public static OptionalBoolean isProfileOppEnabled() { return new OptionalBoolean(); }
    public static OptionalEnum snoop_log_mode() { return new OptionalEnum(); }
    public static void snoop_log_mode(snoop_log_mode_values val) {}
    public static void factory_reset(boolean val) {}
}
