package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothGattService implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BluetoothGattService> CREATOR = new Creator<BluetoothGattService>() {
        @Override
        public BluetoothGattService createFromParcel(Parcel in) {
            return new BluetoothGattService();
        }

        @Override
        public BluetoothGattService[] newArray(int size) {
            return new BluetoothGattService[size];
        }
    };
}
