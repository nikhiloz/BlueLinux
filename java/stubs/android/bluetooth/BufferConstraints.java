package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BufferConstraints implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {}

    public static final Creator<BufferConstraints> CREATOR = new Creator<BufferConstraints>() {
        @Override
        public BufferConstraints createFromParcel(Parcel in) {
            return new BufferConstraints();
        }

        @Override
        public BufferConstraints[] newArray(int size) {
            return new BufferConstraints[size];
        }
    };
}
