package android.content;

import android.os.UserHandle;
import android.os.Handler;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import java.io.File;

public class Context {
    public static final int BIND_AUTO_CREATE = 0x0001;
    public static final int BIND_IMPORTANT = 0x0040;
    public static final int DEVICE_ID_DEFAULT = 0;
    public static final String BLUETOOTH_SERVICE = "bluetooth";

    public boolean bindServiceAsUser(Intent service, ServiceConnection conn, int flags, UserHandle user) { return true; }
    public void unbindService(ServiceConnection conn) {}

    public Intent registerReceiverForAllUsers(BroadcastReceiver receiver, IntentFilter filter, String broadcastPermission, Handler scheduler) { return null; }
    public Intent registerReceiverForAllUsers(BroadcastReceiver receiver, IntentFilter filter, String broadcastPermission, Handler scheduler, int flags) { return null; }
    public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter, String broadcastPermission, Handler scheduler) { return null; }

    public boolean stopService(Intent service) { return false; }
    public ComponentName startService(Intent service) { return null; }

    public File getFilesDir() { return new File("."); }
    public File getCacheDir() { return new File("."); }

    public PackageManager getPackageManager() { return new PackageManager(); }
    public ContentResolver getContentResolver() { return new ContentResolver(); }

    public String getPackageName() { return "com.android.bluetooth"; }
    public String getOpPackageName() { return "com.android.bluetooth"; }
    public android.content.AttributionSource getAttributionSource() { return new android.content.AttributionSource(0, null, null); }
    public Context createDeviceContext(int deviceId) { return this; }
    public int checkCallingOrSelfPermission(String permission) { return 0; }
    public <T> T getSystemService(Class<T> serviceClass) { return null; }
    public Context createContextAsUser(UserHandle user, int flags) { return this; }
    public int getSendingUser() { return 0; }

    public void enforcePermission(String permission, int pid, int uid, String message) {}
    public void enforceCallingOrSelfPermission(String permission, String message) {}
    public void enforceCallingPermission(String permission, String message) {}
    public int checkPermission(String permission, int pid, int uid) { return 0; }


    public ApplicationInfo getApplicationInfo() { return new ApplicationInfo(); }
    public int checkSelfPermission(String permission) { return 0; }
    public Context createPackageContextAsUser(String packageName, int flags, android.os.UserHandle user) throws android.content.pm.PackageManager.NameNotFoundException { return this; }


    public void sendBroadcastAsUser(Intent intent, UserHandle user, String receiverPermission, android.os.Bundle options) {}
    public void sendBroadcastAsUser(Intent intent, UserHandle user) {}
}
