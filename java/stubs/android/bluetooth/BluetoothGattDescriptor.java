package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothGattDescriptor implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BluetoothGattDescriptor> CREATOR = new Creator<BluetoothGattDescriptor>() {
        @Override
        public BluetoothGattDescriptor createFromParcel(Parcel in) {
            return new BluetoothGattDescriptor();
        }

        @Override
        public BluetoothGattDescriptor[] newArray(int size) {
            return new BluetoothGattDescriptor[size];
        }
    };
}
