package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothHeadsetClientCall implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BluetoothHeadsetClientCall> CREATOR = new Creator<BluetoothHeadsetClientCall>() {
        @Override
        public BluetoothHeadsetClientCall createFromParcel(Parcel in) {
            return new BluetoothHeadsetClientCall();
        }

        @Override
        public BluetoothHeadsetClientCall[] newArray(int size) {
            return new BluetoothHeadsetClientCall[size];
        }
    };
}
