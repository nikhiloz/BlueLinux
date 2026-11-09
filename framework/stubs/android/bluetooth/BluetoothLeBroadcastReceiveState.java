package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothLeBroadcastReceiveState implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BluetoothLeBroadcastReceiveState> CREATOR = new Creator<BluetoothLeBroadcastReceiveState>() {
        @Override
        public BluetoothLeBroadcastReceiveState createFromParcel(Parcel in) {
            return new BluetoothLeBroadcastReceiveState();
        }

        @Override
        public BluetoothLeBroadcastReceiveState[] newArray(int size) {
            return new BluetoothLeBroadcastReceiveState[size];
        }
    };
}
