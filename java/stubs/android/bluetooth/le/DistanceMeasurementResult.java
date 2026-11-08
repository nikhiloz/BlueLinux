package android.bluetooth.le;

import android.os.Parcel;
import android.os.Parcelable;

public class DistanceMeasurementResult implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<DistanceMeasurementResult> CREATOR = new Creator<DistanceMeasurementResult>() {
        @Override
        public DistanceMeasurementResult createFromParcel(Parcel in) {
            return new DistanceMeasurementResult();
        }

        @Override
        public DistanceMeasurementResult[] newArray(int size) {
            return new DistanceMeasurementResult[size];
        }
    };
}
