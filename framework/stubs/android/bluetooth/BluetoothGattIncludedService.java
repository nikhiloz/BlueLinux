package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothGattIncludedService implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BluetoothGattIncludedService> CREATOR = new Creator<BluetoothGattIncludedService>() {
        @Override
        public BluetoothGattIncludedService createFromParcel(Parcel in) {
            return new BluetoothGattIncludedService();
        }

        @Override
        public BluetoothGattIncludedService[] newArray(int size) {
            return new BluetoothGattIncludedService[size];
        }
    };
}
