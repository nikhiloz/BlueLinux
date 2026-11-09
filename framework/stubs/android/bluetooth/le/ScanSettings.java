package android.bluetooth.le;

import android.os.Parcel;
import android.os.Parcelable;

public class ScanSettings implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<ScanSettings> CREATOR = new Creator<ScanSettings>() {
        @Override
        public ScanSettings createFromParcel(Parcel in) {
            return new ScanSettings();
        }

        @Override
        public ScanSettings[] newArray(int size) {
            return new ScanSettings[size];
        }
    };
}
