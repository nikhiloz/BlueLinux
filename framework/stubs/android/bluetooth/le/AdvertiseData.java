package android.bluetooth.le;

import android.os.Parcel;
import android.os.Parcelable;

public class AdvertiseData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<AdvertiseData> CREATOR = new Creator<AdvertiseData>() {
        @Override
        public AdvertiseData createFromParcel(Parcel in) {
            return new AdvertiseData();
        }

        @Override
        public AdvertiseData[] newArray(int size) {
            return new AdvertiseData[size];
        }
    };
}
