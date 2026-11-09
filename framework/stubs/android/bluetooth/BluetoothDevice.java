package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothDevice implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BluetoothDevice> CREATOR = new Creator<BluetoothDevice>() {
        @Override
        public BluetoothDevice createFromParcel(Parcel in) {
            return new BluetoothDevice();
        }

        @Override
        public BluetoothDevice[] newArray(int size) {
            return new BluetoothDevice[size];
        }
    };


    public static class BluetoothAddress {
        public BluetoothAddress(String address) {}
        public String getAddress() { return "00:00:00:00:00:00"; }
    }

}
