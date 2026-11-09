package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothLeBroadcastSettings implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BluetoothLeBroadcastSettings> CREATOR = new Creator<BluetoothLeBroadcastSettings>() {
        @Override
        public BluetoothLeBroadcastSettings createFromParcel(Parcel in) {
            return new BluetoothLeBroadcastSettings();
        }

        @Override
        public BluetoothLeBroadcastSettings[] newArray(int size) {
            return new BluetoothLeBroadcastSettings[size];
        }
    };
}
