package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothActivityEnergyInfo implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BluetoothActivityEnergyInfo> CREATOR = new Creator<BluetoothActivityEnergyInfo>() {
        @Override
        public BluetoothActivityEnergyInfo createFromParcel(Parcel in) {
            return new BluetoothActivityEnergyInfo();
        }

        @Override
        public BluetoothActivityEnergyInfo[] newArray(int size) {
            return new BluetoothActivityEnergyInfo[size];
        }
    };
}
