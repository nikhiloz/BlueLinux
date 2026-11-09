package android.bluetooth;

import android.content.AttributionSource;
import java.util.List;
import java.util.ArrayList;

public class AudioInputControl {
    public static List<AudioInputControl> getAudioInputControlServices(IBluetoothVolumeControl service, AttributionSource attributionSource, BluetoothDevice device) {
        return new ArrayList<>();
    }
}
