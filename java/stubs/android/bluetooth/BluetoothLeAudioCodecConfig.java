package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothLeAudioCodecConfig implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BluetoothLeAudioCodecConfig> CREATOR = new Creator<BluetoothLeAudioCodecConfig>() {
        @Override
        public BluetoothLeAudioCodecConfig createFromParcel(Parcel in) {
            return new BluetoothLeAudioCodecConfig();
        }

        @Override
        public BluetoothLeAudioCodecConfig[] newArray(int size) {
            return new BluetoothLeAudioCodecConfig[size];
        }
    };
}
