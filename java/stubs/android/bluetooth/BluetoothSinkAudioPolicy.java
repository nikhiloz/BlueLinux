package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothSinkAudioPolicy implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BluetoothSinkAudioPolicy> CREATOR = new Creator<BluetoothSinkAudioPolicy>() {
        @Override
        public BluetoothSinkAudioPolicy createFromParcel(Parcel in) {
            return new BluetoothSinkAudioPolicy();
        }

        @Override
        public BluetoothSinkAudioPolicy[] newArray(int size) {
            return new BluetoothSinkAudioPolicy[size];
        }
    };
}
