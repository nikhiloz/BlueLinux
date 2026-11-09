package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothHapPresetInfo implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BluetoothHapPresetInfo> CREATOR = new Creator<BluetoothHapPresetInfo>() {
        @Override
        public BluetoothHapPresetInfo createFromParcel(Parcel in) {
            return new BluetoothHapPresetInfo();
        }

        @Override
        public BluetoothHapPresetInfo[] newArray(int size) {
            return new BluetoothHapPresetInfo[size];
        }
    };
}
