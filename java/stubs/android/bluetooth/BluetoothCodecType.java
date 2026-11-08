package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothCodecType implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BluetoothCodecType> CREATOR = new Creator<BluetoothCodecType>() {
        @Override
        public BluetoothCodecType createFromParcel(Parcel in) {
            return new BluetoothCodecType();
        }

        @Override
        public BluetoothCodecType[] newArray(int size) {
            return new BluetoothCodecType[size];
        }
    };
}
