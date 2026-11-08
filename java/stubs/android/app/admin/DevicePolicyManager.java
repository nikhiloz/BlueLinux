package android.app.admin;

import android.content.ComponentName;
import android.os.UserHandle;

public class DevicePolicyManager {
    public boolean isOrganizationOwnedDeviceWithManagedProfile() {
        return false;
    }

    public boolean removeActiveAdmin(ComponentName adminReceiver) {
        return true;
    }

    public boolean isProfileOwnerApp(String packageName) { return false; }
    public UserHandle getDeviceOwnerUser() { return null; }
    public ComponentName getDeviceOwnerComponentOnAnyUser() { return null; }
}
