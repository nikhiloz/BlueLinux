package android.bluetooth.le;

import android.os.Parcel;
import android.os.Parcelable;

public class DistanceMeasurementParams implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<DistanceMeasurementParams> CREATOR = new Creator<DistanceMeasurementParams>() {
        @Override
        public DistanceMeasurementParams createFromParcel(Parcel in) {
            return new DistanceMeasurementParams();
        }

        @Override
        public DistanceMeasurementParams[] newArray(int size) {
            return new DistanceMeasurementParams[size];
        }
    };
}
