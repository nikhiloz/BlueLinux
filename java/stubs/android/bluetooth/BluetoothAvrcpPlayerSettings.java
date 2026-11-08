package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothAvrcpPlayerSettings implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BluetoothAvrcpPlayerSettings> CREATOR = new Creator<BluetoothAvrcpPlayerSettings>() {
        @Override
        public BluetoothAvrcpPlayerSettings createFromParcel(Parcel in) {
            return new BluetoothAvrcpPlayerSettings();
        }

        @Override
        public BluetoothAvrcpPlayerSettings[] newArray(int size) {
            return new BluetoothAvrcpPlayerSettings[size];
        }
    };
}
