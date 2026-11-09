package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothLeAudioContentMetadata implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BluetoothLeAudioContentMetadata> CREATOR = new Creator<BluetoothLeAudioContentMetadata>() {
        @Override
        public BluetoothLeAudioContentMetadata createFromParcel(Parcel in) {
            return new BluetoothLeAudioContentMetadata();
        }

        @Override
        public BluetoothLeAudioContentMetadata[] newArray(int size) {
            return new BluetoothLeAudioContentMetadata[size];
        }
    };
}
