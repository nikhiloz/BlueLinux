package android.app.compat;



public class CompatChanges {
    
    public static boolean isChangeEnabled(long changeId) { return true; }
    public static boolean isChangeEnabled(long changeId, java.util.UUID uuid) { return true; }
    public static boolean isChangeEnabled(long changeId, int uid) { return true; }
    public static boolean isChangeEnabled(long changeId, android.os.UserHandle user) { return true; }

}
