package android.bluetooth.le;

import android.os.Parcel;
import android.os.Parcelable;

public class PeriodicAdvertisingParameters implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<PeriodicAdvertisingParameters> CREATOR = new Creator<PeriodicAdvertisingParameters>() {
        @Override
        public PeriodicAdvertisingParameters createFromParcel(Parcel in) {
            return new PeriodicAdvertisingParameters();
        }

        @Override
        public PeriodicAdvertisingParameters[] newArray(int size) {
            return new PeriodicAdvertisingParameters[size];
        }
    };
}
