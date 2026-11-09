package android.bluetooth.le;

import android.os.Parcel;
import android.os.Parcelable;

public class ScanFilter implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<ScanFilter> CREATOR = new Creator<ScanFilter>() {
        @Override
        public ScanFilter createFromParcel(Parcel in) {
            return new ScanFilter();
        }

        @Override
        public ScanFilter[] newArray(int size) {
            return new ScanFilter[size];
        }
    };
}
