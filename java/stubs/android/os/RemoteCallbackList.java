package android.os;

public class RemoteCallbackList<E extends IInterface> {
    public void register(E callback) {}
    public void register(E callback, Object cookie) {}
    public void unregister(E callback) {}
    public void kill() {}
    public int beginBroadcast() { return 0; }
    public E getBroadcastItem(int index) { return null; }
    public void finishBroadcast() {}
    public int registeredCallbackCount() { return 0; }
}
