package android.os;

public final class BluetoothServiceManager {
    public interface BinderServiceSupplier {
        IBinder get();
    }

    public void registerService(String name, BinderServiceSupplier serviceSupplier) {}
    public IBinder getService(String name) { return null; }
    public BinderServiceSupplier getBluetoothManagerServiceRegisterer() { return null; }
}
