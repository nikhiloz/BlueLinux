package android.bluetooth.le;

import android.os.Parcel;
import android.os.Parcelable;

public class AdvertisingSetParameters implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<AdvertisingSetParameters> CREATOR = new Creator<AdvertisingSetParameters>() {
        @Override
        public AdvertisingSetParameters createFromParcel(Parcel in) {
            return new AdvertisingSetParameters();
        }

        @Override
        public AdvertisingSetParameters[] newArray(int size) {
            return new AdvertisingSetParameters[size];
        }
    };
}
