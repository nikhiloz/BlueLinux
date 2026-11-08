package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothQualityReport implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BluetoothQualityReport> CREATOR = new Creator<BluetoothQualityReport>() {
        @Override
        public BluetoothQualityReport createFromParcel(Parcel in) {
            return new BluetoothQualityReport();
        }

        @Override
        public BluetoothQualityReport[] newArray(int size) {
            return new BluetoothQualityReport[size];
        }
    };
}
