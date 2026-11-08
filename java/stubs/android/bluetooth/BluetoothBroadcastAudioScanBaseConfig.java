package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothBroadcastAudioScanBaseConfig implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BluetoothBroadcastAudioScanBaseConfig> CREATOR = new Creator<BluetoothBroadcastAudioScanBaseConfig>() {
        @Override
        public BluetoothBroadcastAudioScanBaseConfig createFromParcel(Parcel in) {
            return new BluetoothBroadcastAudioScanBaseConfig();
        }

        @Override
        public BluetoothBroadcastAudioScanBaseConfig[] newArray(int size) {
            return new BluetoothBroadcastAudioScanBaseConfig[size];
        }
    };
}
