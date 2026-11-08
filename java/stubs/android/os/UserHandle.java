package android.os;

public class UserHandle {
    public static final UserHandle SYSTEM = new UserHandle();
    public static final UserHandle ALL = new UserHandle();
    public static final UserHandle CURRENT = new UserHandle();

    public static UserHandle of(int id) { return new UserHandle(); }
    public static int getAppId(int uid) { return uid % 100000; }
    public static UserHandle getUserHandleForUid(int uid) { return new UserHandle(); }
}
