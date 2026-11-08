package android.os;

public class UserManager {
    public static final String DISALLOW_BLUETOOTH = "no_bluetooth";
    public static final String DISALLOW_BLUETOOTH_SHARING = "no_bluetooth_sharing";
    public static final String ACTION_USER_RESTRICTIONS_CHANGED = "android.os.action.USER_RESTRICTIONS_CHANGED";

    public boolean hasUserRestriction(String restrictionKey) {
        return false;
    }

    public boolean hasUserRestrictionForUser(String restrictionKey, UserHandle user) {
        return false;
    }

    public boolean isUserRunning(UserHandle user) {
        return true;
    }

    public UserHandle getProfileParent(UserHandle user) { return null; }
}
