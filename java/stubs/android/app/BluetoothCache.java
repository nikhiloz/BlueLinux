package android.app;
import android.bluetooth.IBluetooth;
public class BluetoothCache<T, R> extends IpcDataCache<T, R> {
    public BluetoothCache(String query, QueryDispatcher<T, R> dispatcher) {
        super(1, "bluetooth", query, query, dispatcher);
    }
}
