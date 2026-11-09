package android.app;

public class IpcDataCache<T, R> {
    public IpcDataCache(int maxEntries, String module, String query) {}
    public IpcDataCache(int maxEntries, String module, String query, String name) {}
    public IpcDataCache(int maxEntries, String module, String query, String name, Object dispatcher) {}
    
    public interface QueryDispatcher<T, R> {
        R dispatch(T query);
    }

    public R query(T query) { return null; }
    public void disableForCurrentProcess() {}
    public static void invalidateCache(String module, String query) {}
}
