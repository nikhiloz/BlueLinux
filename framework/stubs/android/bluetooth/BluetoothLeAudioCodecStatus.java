package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothLeAudioCodecStatus implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BluetoothLeAudioCodecStatus> CREATOR = new Creator<BluetoothLeAudioCodecStatus>() {
        @Override
        public BluetoothLeAudioCodecStatus createFromParcel(Parcel in) {
            return new BluetoothLeAudioCodecStatus();
        }

        @Override
        public BluetoothLeAudioCodecStatus[] newArray(int size) {
            return new BluetoothLeAudioCodecStatus[size];
        }
    };
}
