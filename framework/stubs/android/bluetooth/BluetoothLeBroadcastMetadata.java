package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothLeBroadcastMetadata implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BluetoothLeBroadcastMetadata> CREATOR = new Creator<BluetoothLeBroadcastMetadata>() {
        @Override
        public BluetoothLeBroadcastMetadata createFromParcel(Parcel in) {
            return new BluetoothLeBroadcastMetadata();
        }

        @Override
        public BluetoothLeBroadcastMetadata[] newArray(int size) {
            return new BluetoothLeBroadcastMetadata[size];
        }
    };
}
