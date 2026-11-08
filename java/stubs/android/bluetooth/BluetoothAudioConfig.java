package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothAudioConfig implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BluetoothAudioConfig> CREATOR = new Creator<BluetoothAudioConfig>() {
        @Override
        public BluetoothAudioConfig createFromParcel(Parcel in) {
            return new BluetoothAudioConfig();
        }

        @Override
        public BluetoothAudioConfig[] newArray(int size) {
            return new BluetoothAudioConfig[size];
        }
    };
}
