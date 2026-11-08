package android.hardware.bluetooth.offload.leaudio;

import android.os.Parcel;
import android.os.Parcelable;

public class StreamConfiguration implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<StreamConfiguration> CREATOR = new Creator<StreamConfiguration>() {
        @Override
        public StreamConfiguration createFromParcel(Parcel in) {
            return new StreamConfiguration();
        }

        @Override
        public StreamConfiguration[] newArray(int size) {
            return new StreamConfiguration[size];
        }
    };
}
