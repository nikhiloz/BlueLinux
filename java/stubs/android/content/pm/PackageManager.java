package android.content.pm;

import android.os.UserHandle;
import android.content.ComponentName;
import android.content.Intent;
import java.util.List;
import java.util.ArrayList;

public class PackageManager {

    public static final String FEATURE_BLUETOOTH = "android.hardware.bluetooth";
    public static final String FEATURE_BLUETOOTH_LE = "android.hardware.bluetooth_le";
    public static final String FEATURE_TELEVISION = "android.hardware.type.television";
    public static final String FEATURE_LEANBACK = "android.software.leanback";
    public static final String FEATURE_AUTOMOTIVE = "android.hardware.type.automotive";
    public static final String FEATURE_WATCH = "android.hardware.type.watch";
    
    public static final int SIGNATURE_MATCH = 0;
    public static final int PERMISSION_GRANTED = 0;
    public static final int PERMISSION_DENIED = -1;
    public static final int GET_PROVIDERS = 0x00000008;
    public static final int GET_RECEIVERS = 0x00000002;
    public static final int GET_SERVICES = 0x00000004;
    public static final int GET_ACTIVITIES = 0x00000001;
    public static final int COMPONENT_ENABLED_STATE_DISABLED = 2;
    public static final int COMPONENT_ENABLED_STATE_ENABLED = 1;
    public static final int COMPONENT_ENABLED_STATE_DEFAULT = 0;
    public static final int DONT_KILL_APP = 0x00000001;

    public static final int MATCH_SYSTEM_ONLY = 0x00000400;
    public static final int MATCH_ANY_USER = 0x00000040;
    public static final int MATCH_UNINSTALLED_PACKAGES = 0x00002000;
    public static final int MATCH_DISABLED_COMPONENTS = 0x00000200;

    public static class PackageInfoFlags {
        public static PackageInfoFlags of(long flags) { return new PackageInfoFlags(); }
    }

    public static class NameNotFoundException extends Exception {
        public NameNotFoundException() {}
        public NameNotFoundException(String name) { super(name); }
    }

    public boolean isSafeMode() { return false; }
    public boolean hasSystemFeature(String featureName) { return false; }
    public PackageInfo getPackageInfo(String packageName, int flags) throws NameNotFoundException { return null; }
    public PackageInfo getPackageInfo(String packageName, PackageInfoFlags flags) throws NameNotFoundException { return null; }
    public ApplicationInfo getApplicationInfoAsUser(String packageName, int flags, UserHandle user) throws NameNotFoundException { return null; }
    public int checkSignatures(int uid1, int uid2) { return 0; }
    public String[] getPackagesForUid(int uid) { return new String[0]; }
    public List<ResolveInfo> queryIntentServices(Intent intent, int flags) { return new ArrayList<>(); }
    public void setComponentEnabledSetting(ComponentName componentName, int newState, int flags) {}

    public int getPackageUid(String packageName, int flags) throws NameNotFoundException { return 0; }
    public int getPackageUid(String packageName, PackageInfoFlags flags) throws NameNotFoundException { return 0; }
}
