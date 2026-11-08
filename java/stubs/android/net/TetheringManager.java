package android.net;

import java.util.concurrent.Executor;

public class TetheringManager {
    public interface TetheredInterfaceCallback {
        void onAvailable(String iface);
        void onUnavailable();
    }

    public interface TetheredInterfaceRequest {
        void release();
    }

    public TetheredInterfaceRequest requestTetheredInterface(int type, Executor executor, TetheredInterfaceCallback callback) {
        return null;
    }
}
