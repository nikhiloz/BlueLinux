package android.content.pm;

public class ApplicationInfo {
    public int targetSdkVersion = 34;
    public String packageName;
    public int uid;
    public int flags;


    public static final int FLAG_SYSTEM = 1 << 0;
    public static final int FLAG_UPDATED_SYSTEM_APP = 1 << 7;

}
