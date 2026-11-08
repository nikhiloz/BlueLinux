package android.bluetooth.le;

import android.os.Parcel;
import android.os.Parcelable;

public class AdvertiseSettings implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<AdvertiseSettings> CREATOR = new Creator<AdvertiseSettings>() {
        @Override
        public AdvertiseSettings createFromParcel(Parcel in) {
            return new AdvertiseSettings();
        }

        @Override
        public AdvertiseSettings[] newArray(int size) {
            return new AdvertiseSettings[size];
        }
    };
}
