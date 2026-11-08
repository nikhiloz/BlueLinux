package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothCodecStatus implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BluetoothCodecStatus> CREATOR = new Creator<BluetoothCodecStatus>() {
        @Override
        public BluetoothCodecStatus createFromParcel(Parcel in) {
            return new BluetoothCodecStatus();
        }

        @Override
        public BluetoothCodecStatus[] newArray(int size) {
            return new BluetoothCodecStatus[size];
        }
    };
}
