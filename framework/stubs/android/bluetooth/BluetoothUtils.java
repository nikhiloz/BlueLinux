package android.bluetooth;

import android.content.AttributionSource;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.List;

public class BluetoothUtils {
    public static <T> T callServiceIfEnabled(BluetoothAdapter adapter, Supplier<T> getter, T defaultValue) {
        return defaultValue;
    }

    public static void callServiceIfEnabled(BluetoothAdapter adapter, Runnable action) {}

    public static void executeFromBinder(Executor executor, Runnable runnable) {
        if (executor != null) {
            executor.execute(runnable);
        } else {
            runnable.run();
        }
    }
}
