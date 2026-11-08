package android.bluetooth.le;

import android.os.Parcel;
import android.os.Parcelable;

public class ResultStorageDescriptor implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<ResultStorageDescriptor> CREATOR = new Creator<ResultStorageDescriptor>() {
        @Override
        public ResultStorageDescriptor createFromParcel(Parcel in) {
            return new ResultStorageDescriptor();
        }

        @Override
        public ResultStorageDescriptor[] newArray(int size) {
            return new ResultStorageDescriptor[size];
        }
    };
}
