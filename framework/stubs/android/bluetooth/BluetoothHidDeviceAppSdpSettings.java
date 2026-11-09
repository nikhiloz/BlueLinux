package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothHidDeviceAppSdpSettings implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BluetoothHidDeviceAppSdpSettings> CREATOR = new Creator<BluetoothHidDeviceAppSdpSettings>() {
        @Override
        public BluetoothHidDeviceAppSdpSettings createFromParcel(Parcel in) {
            return new BluetoothHidDeviceAppSdpSettings();
        }

        @Override
        public BluetoothHidDeviceAppSdpSettings[] newArray(int size) {
            return new BluetoothHidDeviceAppSdpSettings[size];
        }
    };
}
