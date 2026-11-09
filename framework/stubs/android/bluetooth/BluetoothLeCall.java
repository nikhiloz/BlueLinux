package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothLeCall implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BluetoothLeCall> CREATOR = new Creator<BluetoothLeCall>() {
        @Override
        public BluetoothLeCall createFromParcel(Parcel in) {
            return new BluetoothLeCall();
        }

        @Override
        public BluetoothLeCall[] newArray(int size) {
            return new BluetoothLeCall[size];
        }
    };
}
