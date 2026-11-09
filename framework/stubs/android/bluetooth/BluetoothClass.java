package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothClass implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BluetoothClass> CREATOR = new Creator<BluetoothClass>() {
        @Override
        public BluetoothClass createFromParcel(Parcel in) {
            return new BluetoothClass();
        }

        @Override
        public BluetoothClass[] newArray(int size) {
            return new BluetoothClass[size];
        }
    };
}
