package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothCodecConfig implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BluetoothCodecConfig> CREATOR = new Creator<BluetoothCodecConfig>() {
        @Override
        public BluetoothCodecConfig createFromParcel(Parcel in) {
            return new BluetoothCodecConfig();
        }

        @Override
        public BluetoothCodecConfig[] newArray(int size) {
            return new BluetoothCodecConfig[size];
        }
    };
}
