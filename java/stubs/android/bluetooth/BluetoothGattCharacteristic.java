package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothGattCharacteristic implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BluetoothGattCharacteristic> CREATOR = new Creator<BluetoothGattCharacteristic>() {
        @Override
        public BluetoothGattCharacteristic createFromParcel(Parcel in) {
            return new BluetoothGattCharacteristic();
        }

        @Override
        public BluetoothGattCharacteristic[] newArray(int size) {
            return new BluetoothGattCharacteristic[size];
        }
    };
}
