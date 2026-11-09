package android.os;
public interface IBinder {
    interface DeathRecipient {
        void binderDied();
        default void dumpAsync(java.io.FileDescriptor fd, String[] args) throws RemoteException {}
    }
    void linkToDeath(DeathRecipient recipient, int flags) throws RemoteException;
    boolean unlinkToDeath(DeathRecipient recipient, int flags);
    default void dumpAsync(java.io.FileDescriptor fd, String[] args) throws RemoteException {}
    default IBinder asBinder() { return this; }
}
