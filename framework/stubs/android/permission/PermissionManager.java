package android.permission;

public class PermissionManager {
    public static final int PERMISSION_GRANTED = 0;
    public static final int PERMISSION_HARD_DENIED = -1;
    public static final int PERMISSION_SOFT_DENIED = -2;

    public int checkPermission(String permission, int pid, int uid) {
        return PERMISSION_GRANTED;
    }


    public int checkPermissionForDataDeliveryFromDataSource(String permission, android.content.AttributionSource attributionSource, String message) { return 0; }

}
