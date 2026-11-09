package android.bluetooth.le;

import android.os.Parcel;
import android.os.Parcelable;

public class ScanResult implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<ScanResult> CREATOR = new Creator<ScanResult>() {
        @Override
        public ScanResult createFromParcel(Parcel in) {
            return new ScanResult();
        }

        @Override
        public ScanResult[] newArray(int size) {
            return new ScanResult[size];
        }
    };
}
