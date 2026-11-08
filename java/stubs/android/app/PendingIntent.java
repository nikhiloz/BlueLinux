package android.app;

import android.os.Parcelable;

public class PendingIntent implements Parcelable {
    public boolean isImmutable() {
        return true;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(android.os.Parcel out, int flags) {}

    public static final Creator<PendingIntent> CREATOR = new Creator<PendingIntent>() {
        @Override
        public PendingIntent createFromParcel(android.os.Parcel in) {
            return new PendingIntent();
        }

        @Override
        public PendingIntent[] newArray(int size) {
            return new PendingIntent[size];
        }
    };
}
