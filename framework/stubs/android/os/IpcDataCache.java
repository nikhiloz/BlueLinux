package android.os;

public class IpcDataCache<T, R> {
    public static final String MODULE_BLUETOOTH = "bluetooth";
    public static final String IPC_CACHE_MODULE_SYSTEM = "system";

    public static void invalidateCache(String module, String api) {}
    public static void invalidateCache(String api) {}

    public IpcDataCache(int maxEntries, String module, String api, QueryHandler<T, R> queryHandler) {}
    public IpcDataCache(int maxEntries, String module, String api, String test, QueryHandler<T, R> queryHandler) {}

    public void disableForCurrentProcess() {}
    public R query(T query) { return null; }

    public interface QueryHandler<T, R> {
        R apply(T query);
        default boolean shouldBypassCache(T query) {
            return false;
        }
    }
}
