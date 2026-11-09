package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothHidDeviceAppQosSettings implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BluetoothHidDeviceAppQosSettings> CREATOR = new Creator<BluetoothHidDeviceAppQosSettings>() {
        @Override
        public BluetoothHidDeviceAppQosSettings createFromParcel(Parcel in) {
            return new BluetoothHidDeviceAppQosSettings();
        }

        @Override
        public BluetoothHidDeviceAppQosSettings[] newArray(int size) {
            return new BluetoothHidDeviceAppQosSettings[size];
        }
    };
}
