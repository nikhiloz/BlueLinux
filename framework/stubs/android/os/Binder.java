package android.os;
public class Binder implements IBinder {
    public Binder() {}
    public Binder(String descriptor) {}
    public IBinder asBinder() { return this; }
    public static long clearCallingIdentity() { return 0L; }
    public static void restoreCallingIdentity(long token) {}

    public static int getCallingUid() { return 1000; }
    public static int getCallingPid() { return 100; }

    @Override
    public void linkToDeath(DeathRecipient recipient, int flags) {}

    @Override
    public boolean unlinkToDeath(DeathRecipient recipient, int flags) {
        return true;
    }

    @Override
    public void dumpAsync(java.io.FileDescriptor fd, String[] args) {}
}
